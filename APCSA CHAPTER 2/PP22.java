import cs1.Keyboard;

public class PP22
{
   //-----------------------------------------------------------------
   //  Calculates the average of 3 numbers
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int num1, num2, num3;
      double numSum, numAve;

      System.out.println ("Given 3 integers, I will find the average!");
      System.out.println ("Enter your first number now!");
      num1 = Keyboard.readInt();

      System.out.println ("Enter your second number now!");
      num2 = Keyboard.readInt();
      
      System.out.println ("Enter your final number now!");
      num3 = Keyboard.readInt();
      
      numSum = (num1 + num2 + num3);
      numAve = (numSum/3);
       
      System.out.println ("The Average Is:" + numAve);
     
   }
}