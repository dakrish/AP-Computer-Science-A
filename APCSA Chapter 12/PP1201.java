import java.util.Scanner;

public class PP1201
{
  //-----------------------------------------------------------------
  //  Tests strings to see if they are palindromes.
  //-----------------------------------------------------------------
  public static void main (String[] args)
  {
    String str, another = "y";
    int left, right;
    
    Scanner scan = new Scanner (System.in);
    
    while (another.equalsIgnoreCase("y")) // allows y or Y
    {
      System.out.println ("Enter a potential palindrome:");
      str = scan.nextLine();
      str = str.replaceAll("[^a-zA-Z0-9_-]", "");
      System.out.println(checkPalindrome(str.toLowerCase()));
      System.out.print ("Test another palindrome (y/n)? ");
      another = scan.nextLine();
    }
  }
  static boolean checkPalindrome(String s1)
  {
    boolean palindromic = false;
    int length = s1.length();
    
    if (length == 1)
    {
      palindromic = true;
    }
    if ((length == 2) && (s1.charAt(0) == s1.charAt(1)))
    {
      palindromic = true;
    }
    if (length > 2)
    {
      if (s1.charAt(0) == s1.charAt(length-1))
      {
        palindromic = checkPalindrome(s1.substring(1, length-1));
      }
      else
      {
        palindromic = false;
      }
    }
    return palindromic;
  }
}
