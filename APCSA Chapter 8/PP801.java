import java.util.ArrayList;
import java.util.Scanner;
 
public class PP801
{
   public static void main (String[] args)
   {
     int input = 0;
     int numCount = 0;
      Scanner scan = new Scanner (System.in);
 
      int[] numbers = new int[51];
      ArrayList<Integer> numberList = new ArrayList<Integer>( );
      int current = 0; 
      int other = 0;
 
      while ((input <= 50) && (input >= 0))
      {
      System.out.println ("Enter number:");
      input = scan.nextInt();
      numberList.add(input);
      }
      input = 0;
      // Found this great piece of code on Stack Overflow that lets me convert ArrayLists to arrays. So convenient.
      int[] numbersInput = numberList.stream().mapToInt(i -> i).toArray();
      // End Stack Overflow Code
      for (int ch = 0; ch < numbersInput.length; ch++)
      {
         input = numbersInput[ch];
         if (current >= 0 && current <= 50)
            numbers[current]++;
      }
 
      //  Print the results
      System.out.println ();
      for (int letter=0; letter < numbers.length; letter++)
      {
         System.out.print (letter);
         System.out.println (": " + numbers[letter]);
      }
 
      System.out.println ();
      System.out.println ("Non-alphabetic characters: " + other);
   }
}