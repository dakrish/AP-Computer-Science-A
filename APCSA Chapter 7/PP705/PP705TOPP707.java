public class PP705TOPP707
{
  public static void main(String[] args)
  {
    Task task1 = new Task("Do Math Homework", 1, 3);
    Task task2 = new Task("Study for AP Bio midterm", 5, 10);
    Task task3 = new Task("Do CSA Homework", 10, 7);
    
    System.out.println("PP705: Create + Exercise Task Objects");
    System.out.println("Task 1 has a priority of " + task1.getPriority());
    System.out.println("Task 2 has a priority of " + task2.getPriority());
    System.out.println();
    
    System.out.println("PP706: Implement Complexity");
    System.out.println("Task 1 has a complexity of " + task1.getComplexity());
    System.out.println("Task 2 has a complexity of " + task2.getComplexity());
    System.out.println();
    
    System.out.println("PP707: Implement Comparable");
    task1.compareThree(task2, task3);
    System.out.println("(The above is arranged by priority, with max priority being the highest.");
  }
}