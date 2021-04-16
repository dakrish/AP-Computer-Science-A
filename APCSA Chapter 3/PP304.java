import java.util.Scanner;
import java.text.DecimalFormat;
public class PP304
{
  public static void main(String[] args)
  {

    
    int num1, num2;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to the In-Between Finder! ");
    System.out.println("Enter Your Number Now!");
    num1 = (int) scan.nextDouble();
    num2 = num1 + 1;

    System.out.println("Your value is between " + num1 + " and " + num2);

  }

}