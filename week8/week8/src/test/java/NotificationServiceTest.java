import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotification_shouldAppearInList() {
        NotificationService service = new NotificationService();
        User user = new User("irem", "irem@example.com");

        service.sendNotification(user, "You have a new task");
        List<String> notifications = service.getNotifications(user);

        assertEquals(1, notifications.size());
        assertEquals("You have a new task", notifications.get(0));
    }

    @Test
    public void testGetNotifications_whenNone_shouldReturnEmptyList() {
        NotificationService service = new NotificationService();
        User user = new User("irem", "irem@example.com");

        List<String> notifications = service.getNotifications(user);
        assertTrue(notifications.isEmpty());
    }
}