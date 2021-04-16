import java.util.Scanner;

public class PP501
{
  public static void main (String[] args)
  {
    final int startYear = 1582;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println ("Welcome to leap year calc! Determine whether or not millions of different years are leap years.");
    System.out.println ("To terminate this program, enter a year before the adoption of the Greogorian calendar (1582).");
    System.out.println ("Enter a year: ");
    int year = scan.nextInt();
    
    System.out.println ("You entered: " + year);
    
    while (year >= startYear)
    {
      if (year%4 == 0)
      {
        if (year%100 == 0)
        {
          if (year%400 == 0)
          {
            System.out.println("That is a leap year!");
            
            System.out.print ("Enter a new year: ");
            year = scan.nextInt();
            
            System.out.println ("You entered: " + year);
          }
          else 
          {
            System.out.println("That is not a leap year!");
            
            System.out.print ("Enter a new year: ");
            year = scan.nextInt();
            
            System.out.println ("You entered: " + year);
          }
        }
        else 
        {
          System.out.println("That is a leap year!");
          
          System.out.print ("Enter a new year: ");
          year = scan.nextInt();
          
          System.out.println ("You entered: " + year);
        }
      }
      else
      {
        System.out.println("That is not a leap year!");
        
        System.out.print ("Enter a new year: ");
        year = scan.nextInt();
        
        System.out.println ("You entered: " + year);
      }
    }
    System.out.println("Error! The Greogorian calendar is not mainstream yet! System will self-destruct in 10 . . .");
  }
}

