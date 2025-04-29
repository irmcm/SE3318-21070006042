import java.util.List;

public class TaskManager {
    private NotificationService notificationService;

    public TaskManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /**
     * @requires user != null && task != null
     * @effects assigns task to user and sends notification
     */
    public void assignTaskToUser(User user, Task task) {
        user.addTask(task);
        notificationService.sendNotification(user, "New task assigned: " + task.getTitle());
    }

    /**
     * @requires user != null && taskTitle != null && !taskTitle.isEmpty()
     * @effects removes task with given title from user’s task list
     */
    public void removeTaskFromUser(User user, String taskTitle) {
        List<Task> tasks = user.getTasks();
        tasks.removeIf(task -> task.getTitle().equals(taskTitle));
    }

    /**
     * @requires user != null
     * @effects returns all tasks assigned to user
     */
    public List<Task> listTasksForUser(User user) {
        return user.getTasks();
    }
}
