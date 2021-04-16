import java.util.Scanner;

public class PP302
{
  public static void main(String[] args)
  {

    int num1;
    int num2;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Cubic Addition V1.3! ");
    System.out.println("Enter First Number Now");
    num1=scan.nextInt();

    System.out.println("Enter Second Number Now");
    num2=scan.nextInt();

    System.out.println("The cube of " + num1 + " added to the cube of " + num2 + " is equal to " + ( (int) (Math.pow(num1, 3) + Math.pow(num2, 3))));

  }

}