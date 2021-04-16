import java.util.Scanner;

public class PP307
{
  public static void main(String[] args)
  {

    double s1, s2, s3, semiPerimeter, area;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to HeronCalc V1.3! ");
    System.out.println("Enter side #1 now");
    s1=scan.nextDouble();
    
    System.out.println("Enter side #2 now");
    s2=scan.nextDouble();
    
    System.out.println("Enter side #3 now");
    s3=scan.nextDouble();
    
    semiPerimeter = (s1 + s2 + s3)/2;
    
    System.out.println("Your Triangle has sides of length " + s1 + ", " + s2 + ", and " + s3 + ".");
    System.out.println("The Area of this triangle is approximately " + (Math.sqrt(semiPerimeter * (semiPerimeter-s1) * (semiPerimeter-s2) * (semiPerimeter-s3))) + " square units.");

  }

}