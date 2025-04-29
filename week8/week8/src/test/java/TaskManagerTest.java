import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testAssignTaskToUser_shouldBeInTaskList() {
        NotificationService service = new NotificationService();
        TaskManager manager = new TaskManager(service);
        User user = new User("irem", "irem@example.com");
        Task task = new Task("Fix bugs", LocalDate.now());

        manager.assignTaskToUser(user, task);
        assertTrue(user.getTasks().contains(task));
    }

    @Test
    public void testAssignTaskToUser_shouldSendNotification() {
        NotificationService service = new NotificationService();
        TaskManager manager = new TaskManager(service);
        User user = new User("irem", "irem@example.com");
        Task task = new Task("Push code", LocalDate.now());

        manager.assignTaskToUser(user, task);
        List<String> notifications = service.getNotifications(user);

        assertEquals(1, notifications.size());
        assertEquals("New task assigned: Push code", notifications.get(0));
    }

    @Test
    public void testRemoveTaskFromUser_shouldBeRemoved() {
        NotificationService service = new NotificationService();
        TaskManager manager = new TaskManager(service);
        User user = new User("irem", "irem@example.com");
        Task task = new Task("Review PR", LocalDate.now());

        user.addTask(task);
        manager.removeTaskFromUser(user, "Review PR");

        assertFalse(user.hasTask("Review PR"));
    }

    @Test
    public void testListTasksForUser_shouldReturnCorrectList() {
        NotificationService service = new NotificationService();
        TaskManager manager = new TaskManager(service);
        User user = new User("irem", "irem@example.com");
        Task task1 = new Task("A", LocalDate.now());
        Task task2 = new Task("B", LocalDate.now());

        user.addTask(task1);
        user.addTask(task2);

        List<Task> result = manager.listTasksForUser(user);
        assertEquals(2, result.size());
    }
}