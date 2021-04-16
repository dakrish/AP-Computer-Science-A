//********************************************************************
// ProductCodes.java Author: Lewis/Loftus
//
// Demonstrates the use of a try-catch block.
//********************************************************************
import java.util.Scanner;
public class PP1104
{
//-----------------------------------------------------------------
// Counts the number of product codes that are entered with a
// zone of R and and district greater than 2000.
//-----------------------------------------------------------------
  public static void main(String[] args)
  {
    InvalidDocumentCodeException problem = new InvalidDocumentCodeException();
    String code;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter string (DONE to quit): ");
    code = scan.nextLine();
    PP1104subclass g = new PP1104subclass();
    while (!code.equals("DONE"))
    {
      try
      {
        g.doStuff(code);
        System.out.println("Valid Code Entered!");
      }
      catch(InvalidDocumentCodeException x)
      {
        System.out.println("INVALID!!!!");
      }
      System.out.println("Enter string (DONE to quit): ");
      code = scan.nextLine();
    }
  }
}