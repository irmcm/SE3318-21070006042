import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testIsOverdue_whenDueDatePassed_shouldReturnTrue() {
        Task task = new Task("Submit report", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }

    @Test
    public void testIsOverdue_whenDueDateFuture_shouldReturnFalse() {
        Task task = new Task("Buy milk", LocalDate.now().plusDays(2));
        assertFalse(task.isOverdue());
    }

    @Test
    public void testMarkAsCompleted_setsCompletionTrue() {
        Task task = new Task("Workout", LocalDate.now());
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    public void testGetters() {
        LocalDate date = LocalDate.of(2025, 5, 1);
        Task task = new Task("Test", date);
        assertEquals("Test", task.getTitle());
        assertEquals(date, task.getDueDate());
        assertFalse(task.isCompleted());
    }
}