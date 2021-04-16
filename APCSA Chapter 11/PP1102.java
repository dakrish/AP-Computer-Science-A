//********************************************************************
// ProductCodes.java Author: Lewis/Loftus
//
// Demonstrates the use of a try-catch block.
//********************************************************************
import java.util.Scanner;
public class PP1102
{
//-----------------------------------------------------------------
// Counts the number of product codes that are entered with a
// zone of R and and district greater than 2000.
//-----------------------------------------------------------------
  public static void main(String[] args)
  {
    StringTooLongException problem = new StringTooLongException("Input string is toooooooo long.");
    String code;
    PP1102subclass g = new PP1102subclass();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter string (DONE to quit): ");
    code = scan.nextLine();
    while (!code.equals("DONE"))
    {
      try
      {
        System.out.println(g.doStuff(code));
      }
      catch(StringTooLongException x)
      {
        System.out.println("INVALID!!!!");
      }
      System.out.println("Enter string (DONE to quit): ");
      code = scan.nextLine();
    }
  }
}