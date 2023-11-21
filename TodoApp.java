import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    scanner.nextLine(); // Consume the newline character
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    taskList.addTask(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("Tasks:");
                    taskList.displayTasks();
                    break;

                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < taskList.getTasks().size()) {
                        taskList.getTasks().get(index).markAsCompleted();
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
