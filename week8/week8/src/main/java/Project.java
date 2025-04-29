import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<User> users;
    private List<Task> tasks;

    public Project() {
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    /**
     * @requires user != null && username is unique in the project
     * @effects adds user to the project
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * @requires task != null
     * @effects adds task to the project
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * @requires title != null && !title.isEmpty()
     * @effects returns the task with the given title, or null if not found
     */
    public Task getTaskByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}