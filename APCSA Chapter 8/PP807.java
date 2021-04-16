import java.util.Scanner;

public class PP807
{
  public static void main (String[] args)
  {
    boolean canPlay = true;
    int deckLength = 0;
    int turnCount = 2;
    int slap = 6;
    String winnerNameSlapJack = "";
    String winnerNameSlapFace = "";
    card tempCard;
    player human1 = new player();
    human1.setPlayability(true);
    player human2 = new player();
    human2.setPlayability(true);
    player house = new player();
    house.setPlayability(true);
    deck decky = new deck();
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Today, you have decided to see the current SPEED DEALING WORLD RECORDER HOLDER attempt to beat his personal record by dealing to three different people.");
    long start = System.currentTimeMillis();
    while(start >= System.currentTimeMillis() - 1000); // Found this on Stack Overflow
    System.out.println("He starts to deal at an INSANE PACE!!");
    start = System.currentTimeMillis();
    while(start >= System.currentTimeMillis() - 1000); // Found this on Stack Overflow
    decky.shuffle();
    decky.dealAllCards();
    System.out.println("In a fraction of a second, he has dealt the entire deck. He breaks his record of 6 seconds, and the crowd around you cheers while you sit on a stool, dumbfounded by his extraordinary capabilities.");
    
    System.out.println("You later leave the casino after having lost a couple thousand dollars due to the infamous betting-compatible slot machine of QPP 508.");
  }
}