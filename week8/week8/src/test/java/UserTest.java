import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testAddTask_shouldBeInTaskList() {
        User user = new User("irem", "irem@example.com");
        Task task = new Task("Do homework", LocalDate.now());

        user.addTask(task);
        assertTrue(user.getTasks().contains(task));
    }

    @Test
    public void testHasTask_existingTask_shouldReturnTrue() {
        User user = new User("irem", "irem@example.com");
        Task task = new Task("Exercise", LocalDate.now());
        user.addTask(task);

        assertTrue(user.hasTask("Exercise"));
    }

    @Test
    public void testHasTask_nonExistingTask_shouldReturnFalse() {
        User user = new User("irem", "irem@example.com");
        assertFalse(user.hasTask("Sleep"));
    }

    @Test
    public void testGetters() {
        User user = new User("irem", "irem@example.com");
        assertEquals("irem", user.getUsername());
        assertEquals("irem@example.com", user.getEmail());
    }
}