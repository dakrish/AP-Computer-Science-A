//********************************************************************
// ProductCodes.java Author: Lewis/Loftus
//
// Demonstrates the use of a try-catch block.
//********************************************************************
import java.util.Scanner;
public class PP1101
{
//-----------------------------------------------------------------
// Counts the number of product codes that are entered with a
// zone of R and and district greater than 2000.
//-----------------------------------------------------------------
  public static void main(String[] args) throws StringTooLongException
  {
    StringTooLongException problem = new StringTooLongException("Input string is toooooooo long.");
    PP1102mini g = new PP1102mini();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter string (DONE to quit): ");
    String code = scan.nextLine();
    while (!code.equals("DONE"))
    {
      if (code.length() >= 20)
        throw problem;
      else
        System.out.println("Valid string entered!");
      System.out.println("Enter string (DONE to quit): ");
      code = scan.nextLine();
    }
  }
}