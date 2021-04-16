import java.util.Scanner;
import java.util.Random;

public class PP504
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
    Random rand = new Random();
    int guess = 0;
    int chosen = 0;
    int guessCount = 0;
    System.out.println ("Welcome to Hi-Lo java! Guess my secret number! (Hint it is between 1 and 100) To quit, type in 200");
    System.out.println ("Enter a number: ");
    guess = scan.nextInt();
    chosen = (rand.nextInt(100)+1);
    while (guess != 300)
    {
      while (guess != 200)
      {
        if (guess < chosen)
        {
          guessCount++;
          System.out.println("Nope! Your guess was incorrect. The actual number is HIGHER. Number of guesses: " + guessCount);
          guess = scan.nextInt();
        }
        if (guess > chosen)
        {
          guessCount++;
          System.out.println("Nope! Your guess was incorrect. The actual number is LOWER. Number of guesses: " + guessCount);
          guess = scan.nextInt();
        }
        if (guess == chosen)
        {
          guessCount++;
          System.out.println("Congratulations! You guessed it correctly! This took you " + guessCount + " guesses.");
          System.out.println("Want to play again? If not, type in 200. Otherwise, keep guessing.");
          guessCount = 0;
          chosen = (rand.nextInt(100)+1);
          guess = scan.nextInt();
        }
      }
      System.out.println("Are you sure you want to quit? Type in 300 if you really want to quit.");
      guess = scan.nextInt();
      chosen = (rand.nextInt(100)+1);
    }
  }
}
