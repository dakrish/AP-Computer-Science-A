import java.util.Scanner;
public class PP1202 {
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter one number.");
    int num1 = scan.nextInt();
    System.out.println("Enter another number.");
    int num2 = scan.nextInt();
    System.out.print("GCD: ");
    System.out.println(calcGCD(num1, num2));
  }
  static int calcGCD (int num1, int num2) 
  {
    int gcd =  1;
    
    if ((num2%num1) == 0)
    {
      gcd = num1;
    }
    else
    {
      gcd = calcGCD(num2, num1%num2);
    }
    return gcd;
  }
}
