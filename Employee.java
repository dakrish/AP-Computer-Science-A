public class Employee
{
   private int num, date, raise1, raise2, raise3, raise4, raise5;
   
   public Employee (int n, int d, int r1, int r2, int r3, int r4, int r5)
   {
      num = n;
      date = d;
      raise1 = r1;
      raise2 = r2;
      raise3 = r3;
      raise4 = r4;
      raise5 = r5;
   } 
   public String toString()
   {
      return "Employee Number: " + num + "\nDate Hired: " + date + "\nRaise #1: " + raise1 + "\nRaise #2: " + raise2 + "\nRaise #3: " + raise3 + "\nRaise #4: " + raise4 + "\nRaise #5: " + raise5;
   }
}