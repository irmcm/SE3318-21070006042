import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private Map<String, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    /**
     * @requires user != null && message != null
     * @effects adds message to the user's notification list
     */
    public void sendNotification(User user, String message) {
        String username = user.getUsername();
        notifications.putIfAbsent(username, new ArrayList<>());
        notifications.get(username).add(message);
    }

    /**
     * @requires user != null
     * @effects returns list of messages sent to the user
     */
    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user.getUsername(), new ArrayList<>());
    }
}