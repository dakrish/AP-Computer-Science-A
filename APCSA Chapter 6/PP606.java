import java.util.Random;

public class PP606
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
    int heads = 0;
    int tails = 0;
    for (int flips = 1; flips <=1000; flips++){
      coin1.flip();
      if (coin1.isHeads()==true)
      {heads++;}
      else
      {tails++;}
    }
    System.out.println(heads+" heads and "+tails+" tails.");
  }
}