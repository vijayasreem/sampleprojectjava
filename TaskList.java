import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task.getDescription() +
                    (task.isCompleted() ? " (Completed)" : ""));
        }
    }
}
