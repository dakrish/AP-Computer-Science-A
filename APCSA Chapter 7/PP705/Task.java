public class Task implements priority, Comparable<Task>, Complexity
{
  String taskName;
  int priorityLevel, complexityLevel, priorityRanking;
  public Task(String inputtedTaskName, int inputtedPriority, int inputtedComplexity)
  {
    taskName = inputtedTaskName;
    priorityLevel = inputtedPriority;
    complexityLevel = inputtedComplexity;
    priorityRanking = 0;
  }
  public int getPriority()
  {
    return priorityLevel;
  }
  public String getTaskName()
  {
    return taskName;
  }
  public void setPriority(int newPriorityLevel)
  {
    priorityLevel = newPriorityLevel;
  }
  public void setTaskName(String newTaskName)
  {
    taskName = newTaskName;
  }
  public int getComplexity()
  {
    return complexityLevel;
  }
  public void setComplexity(int newComplexity)
  {
    complexityLevel = newComplexity;
  }
  public String toString() 
  { 
    return taskName + " has a priority of " + priorityLevel + " and has a complexity of " + complexityLevel + "."; 
  }
  public int compareTo(Task Task2)
  {  
    if(this.getPriority()==Task2.getPriority())
    {
      return 0;  
    }
    else if(this.getPriority()>Task2.getPriority())  
    {
      this.priorityRanking++;
      return 1; 
    }
    else  
    {
      this.priorityRanking--;
      return -1;  
    }
  }
  public int getPriorityRanking()
  {
    return this.priorityRanking;
  }
  // I recognize that the below code is probably one of the most innefficient ways of 
  // ordering each of the three tasks by priority, but it seemed the most intuitive to 
  // me. Also I don't know how I would make this shorter.
  public void compareThree(Task t2, Task t3)
  { 
    int ax, bx, cx, a, b, c, maxAB, maxAC, ultraMIN, ultraMAX, minAB = 0;
    ax = this.compareTo(t2);
    bx = this.compareTo(t3);
    cx = t2.compareTo(t3);
    
    a = this.getPriorityRanking();
    b = t2.getPriorityRanking();
    c = t3.getPriorityRanking();
    
    maxAB = Math.max(a, b);
    minAB = Math.min(a,b);
    
    ultraMAX = Math.max(maxAB, c);
    ultraMIN = Math.min(minAB, c);
    
    if ((this.getPriorityRanking() == ultraMAX) && (t3.getPriorityRanking() == ultraMIN))
    {
      System.out.println(this);
      System.out.println(t2);
      System.out.println(t3);
    }
    if ((this.getPriorityRanking() == ultraMAX) && (t2.getPriorityRanking() == ultraMIN))
    {
      System.out.println(this);
      System.out.println(t3);
      System.out.println(t2);
    }
    if ((t2.getPriorityRanking() == ultraMAX) && (t3.getPriorityRanking() == ultraMIN))
    {
      System.out.println(t2);
      System.out.println(this);
      System.out.println(t3);
    }
    if ((t2.getPriorityRanking() == ultraMAX) && (this.getPriorityRanking() == ultraMIN))
    {
      System.out.println(t2);
      System.out.println(t3);
      System.out.println(this);
    }
    if ((t3.getPriorityRanking() == ultraMAX) && (this.getPriorityRanking() == ultraMIN))
    {
      System.out.println(t3);
      System.out.println(t2);
      System.out.println(this);
    }
    if ((t3.getPriorityRanking() == ultraMAX) && (t2.getPriorityRanking() == ultraMIN))
    {
      System.out.println(t3);
      System.out.println(this);
      System.out.println(t2);
    }
  }
}