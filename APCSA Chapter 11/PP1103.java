//********************************************************************
// ProductCodes.java Author: Lewis/Loftus
//
// Demonstrates the use of a try-catch block.
//********************************************************************
import java.util.Scanner;
public class PP1103
{
//-----------------------------------------------------------------
// Counts the number of product codes that are entered with a
// zone of R and and district greater than 2000.
//-----------------------------------------------------------------
  public static void main(String[] args) throws InvalidDocumentCodeException
  {
    InvalidDocumentCodeException problem = new InvalidDocumentCodeException();
    String code;
    char zone;
    int district, valid = 0, banned = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter product code (XXX to quit): ");
    code = scan.nextLine();
    while (!code.equals("XXX"))
    {
      if ((code.charAt(0) == 'c') || (code.charAt(0) == 'u') || (code.charAt(0) == 'p') || (code.charAt(0) == 'C') || (code.charAt(0) == 'U') || (code.charAt(0) == 'P')){}
      else { throw problem; }
      System.out.print("Valid Code Entered!");
      System.out.print("Enter product code (XXX to quit): ");
      code = scan.nextLine();
    }
  }
}