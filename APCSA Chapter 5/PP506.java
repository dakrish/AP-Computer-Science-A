import java.util.Random;

public class PP506
{
  public static void main (String[] args)
  {
    final int winCondition = 3;
    int count1 = 0, count2 = 0;
    class Coin
    {
      private final int HEADS = 0;
      private final int TAILS = 0;
      
      private int face;
      
      public Coin ()
      {
        flip();
      }
      public void flip ()
      {
        face = (int) (Math.random() * 2);
      }
      public boolean isHeads ()
      {
        return (face == HEADS);
      }
      public String toString()
      {
        String faceName;
        
        if (face == HEADS)
          faceName = "Heads";
        else
          faceName = "Tails";
        
        return faceName;
      }
    }
    Coin coin1 = new Coin();
    Coin coin2 = new Coin();
    int flips = 0;
    while (count1 < winCondition && count2 < winCondition)
    {
      coin1.flip();
      coin2.flip();
      System.out.print ("Coin 1: " + coin1);
      System.out.println ("   Coin 2: " + coin2);
      if (coin1.isHeads())
      {
        count1++;
        flips++;
      }
      else
      {
        count1 = 0;
        flips++;
      }
      if (coin2.isHeads())
      {
        count2++;
      }
      else
      {
        count2 = 0;
      }
    }
    if (count1 < winCondition)
    {
      System.out.println ("Coin 2 Wins! It took " + flips + " flips.");
    }
    if (count2 < winCondition)
    {
      System.out.println ("Coin 1 Wins! It took " + flips + " flips.");
    }
    if (count1 == count2)
    {
      System.out.println ("It's a TIE! It took " + flips + " flips.");
    }
  }
}