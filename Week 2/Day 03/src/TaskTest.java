//Create a Task class with title (String), priority (int: 1 = highest, 5 = lowest), and dueDate (String).
// Sort tasks by:Priority ascending (lower number = higher priority)
//dueDate alphabetically if priorities are the same

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskTest  {
  public static void main(String[] args) {

      Task t1 = new Task("Read Email", 5, "20260701");
      Task t2 = new Task("Clean House", 1, "20260702");
      Task t3 = new Task("Attend Meeting", 1, "20260702");
      Task t4 = new Task("Take Out Garbage", 5, "20260705");
      Task t5 = new Task("Close Garbage", 1, "20260706");

      List<Task> tasks = new ArrayList<Task>();
      tasks.add(t1);
      tasks.add(t2);
      tasks.add(t3);
      tasks.add(t4);
      tasks.add(t5);

      tasks.sort(Comparator.comparing(Task::getPriority).thenComparing(Task::getDueDate));

      for(Task task: tasks) {
          System.out.println(task);
      }
  }
}
