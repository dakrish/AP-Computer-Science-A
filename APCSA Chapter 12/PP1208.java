import java.util.Scanner;

public class PP1208
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("BlurbCheck");
    System.out.print("Enter Blurb: ");
    String blurb = scan.nextLine();
    System.out.println(blurbCheck(blurb));
  }
  static boolean blurbCheck (String s) 
  {
    boolean valid = true;
    if (s.substring(0,1) != "x")
    {
      valid = false;
    }
    else
    {
      String newS = s.substring(1);
      while ((newS.substring(0, 1) == "y") && (newS.length() > 0))
      {
        newS = newS.substring(1);
      }
      return whatzitCheck(newS);
    }
  }
  static String whoozitCheck (String s) 
  {
    boolean valid = true;
    if (s.substring(0,1) != "x")
    {
      valid = false;
    }
    else
    {
      String newS = s.substring(1);
      while ((newS.substring(0, 1) == "y") && (newS.length() > 0))
      {
        newS = newS.substring(1);
      }
      return whatzitCheck(newS);
    }
  }
  static boolean whatzitCheck(String s)
  {
    String s = "q";
    if (Math.random() - 0.5 >= 0) 
      return s + "z" + whoozitCheck();
    else
      return s + "d" + whoozitCheck();
  }
}
