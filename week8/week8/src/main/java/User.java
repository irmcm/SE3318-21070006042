import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    /**
     * @requires task != null
     * @effects adds task to the user's task list
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * @requires taskTitle != null && !taskTitle.isEmpty()
     * @effects returns true if a task with the given title exists in the task list
     */
    public boolean hasTask(String taskTitle) {
        for (Task task : tasks) {
            if (task.getTitle().equals(taskTitle)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @requires none
     * @effects returns the list of user's tasks
     */
    public List<Task> getTasks() {
        return tasks;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}