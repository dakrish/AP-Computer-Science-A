public class CounterTest
{
  public static void main(String[] args)
  {
    class Counter
    {
      public int count = 0;
      public void Count()
      {
        count = 0;
      }
      public void click()
      {
        count++;
      }
      public int getCount()
      {
        return count;
      }
      public void reset()
      {
        count = 0;
      }
    }
    Counter count1, count2;
    
    count1 = new Counter();
    count2 = new Counter();
    
    count1.count = 12;
    count2.count = 14;
    
    System.out.println("count 1 is " + count1.count + " and count 2 is " + count2.count);
    
    count1.Count();
    count2.Count();
    
    System.out.println("count 1 is now " + count1.count + " and count 2 is now " + count2.count);
    
    count1.click();
    
    System.out.println("count 1 is now " + count1.count + " and count 2 is now " + count2.count);
    
    count2.click();
    
    System.out.println("count 1 is now " + count1.getCount() + " and count 2 is now " + count2.getCount());
    
    count1.reset();
    count2.reset();
    
    System.out.println("Count 1 final value: " + count1.getCount() + " and Count 2 final value: " + count2.getCount());
    
    
  }
}