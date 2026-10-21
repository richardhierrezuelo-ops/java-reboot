//Create a Task class with title (String), priority (int: 1 = highest, 5 = lowest), and dueDate (String).
// Sort tasks by:Priority ascending (lower number = higher priority)
//dueDate alphabetically if priorities are the same

public class Task {
    private String title;
    private int priority;
    private String dueDate;

    public Task(String title, int priority, String dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
       return priority;
    }

    public String getDueDate() {
       return dueDate;
    }

    @Override
    public String toString() {
//        return "title: " + title + ", priority: " + priority + ", dueDate: " + dueDate;
        return String.format("%s | Priority: %d | Due: %s", title, priority, dueDate);
    }

}
