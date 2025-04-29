import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

    @Test
    public void testAddUser_shouldBeInUserList() {
        Project project = new Project();
        User user = new User("irem", "irem@example.com");

        project.addUser(user);
        assertTrue(project.getUsers().contains(user));
    }

    @Test
    public void testAddTask_shouldBeInTaskList() {
        Project project = new Project();
        Task task = new Task("Design UI", LocalDate.now());

        project.addTask(task);
        assertTrue(project.getTasks().contains(task));
    }

    @Test
    public void testGetTaskByTitle_existingTask_shouldReturnTask() {
        Project project = new Project();
        Task task = new Task("Test Feature", LocalDate.now());
        project.addTask(task);

        Task result = project.getTaskByTitle("Test Feature");
        assertNotNull(result);
        assertEquals("Test Feature", result.getTitle());
    }

    @Test
    public void testGetTaskByTitle_nonExistingTask_shouldReturnNull() {
        Project project = new Project();
        assertNull(project.getTaskByTitle("Nonexistent Task"));
    }
}
