import java.util.Scanner;

public class PP305
{
  public static void main(String[] args)
  {

    double x1, x2, y1, y2;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Distance Calculator V1.3! ");
    System.out.println("Enter x1 value now");
    x1=scan.nextDouble();

    System.out.println("Enter y1 value now");
    y1=scan.nextDouble();
    
    System.out.println("Enter x2 value now");
    x2=scan.nextDouble();
    
    System.out.println("Enter y2 value now");
    y2=scan.nextDouble();

    System.out.println("Your Coodinates were (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")");
    System.out.println("The Distance between them is approximately " + Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2))) + " units.");

  }

}