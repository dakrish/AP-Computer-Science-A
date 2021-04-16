import java.util.ArrayList;
import java.util.Scanner;
 
public class PP803
{
   public static void main (String[] args)
   {
     int input = 0;
     int numCount = 0;
      Scanner scan = new Scanner (System.in);
 
      int[] numbers = new int[101];
      ArrayList<Integer> numberList = new ArrayList<Integer>( );
      int current = 0; 
      int other = 0;
 
      while ((input <= 100) && (input >= 0))
      {
      System.out.println ("Enter number:");
      input = scan.nextInt();
      numberList.add(input);
      }
      input = 0;
      // Found this great piece of code on Stack Overflow that lets me convert ArrayLists to arrays. So convenient.
      int[] numbersInput = numberList.stream().mapToInt(i -> i).toArray();
      // End Stack Overflow Code
      int numsRead = 0;
      while (numsRead < numbersInput.length)
      {
         input = numbersInput[numsRead];
         if (input >= 0 && input <= 10)
            numbers[0]++;
         if (input > 10 && input <= 20)
            numbers[1]++;
         if (input > 20 && input <= 30)
            numbers[2]++;
         if (input > 30 && input <= 40)
            numbers[3]++;
         if (input > 40 && input <= 50)
            numbers[4]++;
         if (input > 50 && input <= 60)
            numbers[5]++;
         if (input > 60 && input <= 70)
            numbers[6]++;
         if (input > 70 && input <= 80)
            numbers[7]++;
         if (input > 80 && input <= 90)
            numbers[8]++;
         if (input > 90 && input <= 100)
            numbers[9]++;
         numsRead++;
      }
 
      //  Print the results
      System.out.println ();
         System.out.print ("1  -  10  | ");
         for (int ch = 0; ch < numbers[0]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("11  - 20  | ");
         for (int ch = 0; ch < numbers[1]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("21  - 30  | ");
         for (int ch = 0; ch < numbers[2]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("31  - 40  | ");
         for (int ch = 0; ch < numbers[3]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("41  - 50  | ");
         for (int ch = 0; ch < numbers[4]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("51  - 60  | ");
         for (int ch = 0; ch < numbers[5]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("61  - 70  | ");
         for (int ch = 0; ch < numbers[6]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("71  - 80  | ");
         for (int ch = 0; ch < numbers[7]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("81  - 90  | ");
         for (int ch = 0; ch < numbers[8]; ch++)
           System.out.print("*");
         System.out.println ();
         System.out.print ("91  - 100  | ");
         for (int ch = 0; ch < numbers[9]; ch++)
           System.out.print("*");
         System.out.println();
   }
}