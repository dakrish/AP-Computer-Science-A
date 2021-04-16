import java.util.Scanner;
public class TestingEX
{
  public static void main (String[] args)
  {
    double sum = 0.0;
    Scanner scan = new Scanner (System.in); 
    double[] numbers = new double[10]; 
    System.out.println ("The size of the array: " + numbers.length); 
    for (int index = 0; index < numbers.length; index++)
    {
      System.out.print ("Enter number " + (index+1) + ": ");
      numbers[index] = scan.nextDouble();
    }
    
    for (int index = numbers.length-1; index >= 0; index--)
      sum += numbers[index];
    
    System.out.println ("The sum: " + sum);
  }
} 