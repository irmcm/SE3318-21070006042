import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    /**
     * @requires none
     * @effects returns true if current date is after dueDate and task is not completed
     */
    public boolean isOverdue() {
        return !isCompleted && LocalDate.now().isAfter(dueDate);
    }

    /**
     * @requires task must not already be completed
     * @effects sets isCompleted to true
     */
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}