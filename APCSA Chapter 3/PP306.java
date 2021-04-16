import java.util.Scanner;

public class PP306
{
  public static void main(String[] args)
  {

    double radius;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Sphere Calc V1.3! ");
    System.out.println("Enter radius now");
    radius=scan.nextDouble();

    System.out.println("Your Radius was " + radius);
    System.out.println("The Volume of this sphere is approximately " + ((4 * (Math.PI * (Math.pow(radius, 3)))) / 3) + " cubic units.");
    System.out.println("The Surface Area of this sphere is approximately " + (4 * Math.PI * Math.pow(radius, 2)) + " square units.");

  }

}