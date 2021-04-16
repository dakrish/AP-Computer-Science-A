import java.util.Scanner;

public class PP503
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
    int index = 0;
    int zeroCount = 0;
    int oddCount = 0;
    int evenCount = 0;
    System.out.println ("Enter a number: ");
    int num1 = scan.nextInt();
    String num = num1+"";
    System.out.println ("You entered: " + num);
    
    while (index <= num.length()-1)
    {
      char c1 = num.charAt(index);
      if (c1 == '0')
      {
        zeroCount++;
      }
      if (c1 == '1' || c1 == '3' || c1 == '5' || c1 == '7' || c1 == '9')
      {
        oddCount++;
      }
      if (c1 == '2' || c1 == '4' || c1 == '6' || c1 == '8')
      {
        evenCount++;
      }
      index++;
    }
    System.out.println("Number of 0: " + zeroCount + "  Number of odd: " + oddCount + "  Number of even: " + evenCount);
  }
}
