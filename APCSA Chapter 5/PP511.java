import java.util.Scanner;

public class PP511
{
  public static void main(String[] args)
  {
    System.out.println("Initializing the greedy pig dice game . . .");
    class PairOfDice
    {
      class Die
      {
        private int faceValue;
        public Die()
        {
          faceValue = 1;
        }
        public void roll()
        {
          faceValue = (int)(Math.random() * 6) + 1;
        }
        public void setFaceValue(int value)
        {
          faceValue = value;
        }
        public int getFaceValue()
        {
          return faceValue;
        }
        public String toString()
        {
          String result = Integer.toString(faceValue);
          return result;
        }
      }
      private Die die1, die2;
      public PairOfDice()
      {
        die1=new Die();
        die2=new Die();
      }
      public int rollDie1()
      {
        return die1.getFaceValue();
      }
      public int rollDie2()
      {
        return die2.getFaceValue();
      }
      public void placeDie1(int dieValue)
      {
        die1.setFaceValue(dieValue);
      }
      public void placeDie2(int dieValue)
      {
        die2.setFaceValue(dieValue);
      }
      public void rollBothDice()
      {
        die1.roll();
        die2.roll();
      }
      public int add()
      {
        return die1.getFaceValue()+die2.getFaceValue();
      }
    }
    int turnCount = 0;
    int compTotal = 0;
    int playerTotal = 0;
    int compRoundTotal = 0;
    int playerRoundTotal = 0;
    int winnerExists = 0;
    System.out.println("You have been chosen to go first!");
    PairOfDice pair = new PairOfDice();
    Scanner scan = new Scanner(System.in);
    while (winnerExists == 0)
    {
      while ((compTotal < 100) && (playerTotal < 100))
      {
        playerRoundTotal = 0;
        while (turnCount%2 == 0)
        {
          pair.rollBothDice();
          playerRoundTotal += pair.add();
          playerTotal += pair.add();
          System.out.println("You rolled " + pair.rollDie1() + " and " + pair.rollDie2() + ". Your current round total is " + playerRoundTotal + " and your overall total is " + playerTotal + ".");
          if ((pair.rollDie1() == 1 || pair.rollDie2() == 1) && (pair.rollDie1() != pair.rollDie2()))
          {
            System.out.println("Oh no! You rolled a 1! There goes all the points you got this round.");
            playerTotal -= playerRoundTotal;
            playerRoundTotal = 0;
            turnCount++;
          }
          if ((pair.rollDie1() == 1) && (pair.rollDie2() == 1))
          {
            System.out.println("OH NO!!! You rolled double ones!!! There goes all the point you have gotten this entire game.");
            playerTotal = 00;
            playerRoundTotal = 0;
            turnCount++;
          }
          if ((pair.rollDie1() != 1) && (pair.rollDie2() != 1))
          {
            System.out.println("Do you wish to continue to roll? Type 0 if yes and 1 if no.");
            turnCount += scan.nextInt();
          }
          if ((playerTotal > 100) || (playerTotal == 100))
          {
            winnerExists = 1;
          }
        }
        compRoundTotal = 0;
        while (turnCount%2 == 1)
        {
          pair.rollBothDice();
          compRoundTotal += pair.add();
          compTotal += pair.add();
          System.out.println("The House rolled " + pair.rollDie1() + " and " + pair.rollDie2() + ". Its current round total is " + compRoundTotal + " and its overall total is " + compTotal + ".");
          if ((pair.rollDie1() == 1 || pair.rollDie2() == 1) && (pair.rollDie1() != pair.rollDie2()))
          {
            System.out.println("Oh no! The House rolled a 1! It lost all of its points from this round.");
            compTotal -= compRoundTotal;
            compRoundTotal = 0;
            turnCount++;
          }
          if ((pair.rollDie1() == 1) && (pair.rollDie2() == 1))
          {
            System.out.println("OH NO!!! The House rolled double ones!!! It lost all of its points from this entire game.");
            compTotal = 0;
            compRoundTotal = 0;
            turnCount++;
          }
          if (compRoundTotal < 20)
          {
            turnCount += 0;
          }
          if ((compRoundTotal > 20) || (compRoundTotal == 20))
          {
            System.out.println("The House has gotten 20 (or more) points this turn, and thus, it feels bad for you and passes.");
            turnCount++;
          }
          if ((compTotal > 100) || (compTotal == 100))
          {
            winnerExists = 1;
          }
        }
      }
    }
    if ((playerTotal > 100) || (playerTotal == 100))
    {
      System.out.println ("The Player wins!");
    }
    if ((compTotal > 100) || (compTotal == 100))
    {
      System.out.println ("The House wins!");
    }
    scan.close();
  }
}
