import cs1.Keyboard;

public class PP23
{
   //-----------------------------------------------------------------
   //  Calculates the sum, difference, and product of 2 numbers
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      double num1, num2, numSum, numDiff, numProd;

      System.out.println ("Give me some numbers, and I will do basic math!");
      System.out.println ("Enter your first number now!");
      num1 = Keyboard.readDouble();

      System.out.println ("Enter your second number now!");
      num2 = Keyboard.readDouble();
      
      numSum = (num1 + num2);
      numDiff = (num1 - num2);
      numProd = (num1 * num2);
       
      System.out.println ("The Sum Is:" + numSum);
      System.out.println ("The Difference Is:" + numDiff);
      System.out.println ("The Product Is:" + numProd);
      System.out.println ();
      System.out.println ("Thank you!");
     
   }
}