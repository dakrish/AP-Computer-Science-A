public class PP901
{
  public static void main(String[] args)
  {
    MonetaryCoin mc1 = new MonetaryCoin(10);
    MonetaryCoin mc2 = new MonetaryCoin(5);
    System.out.println("Coin1 value: " + mc1.getValue());
    System.out.println("Coin2 value: " + mc2.getValue());
    System.out.println("Coins' collective value: " + (mc1.getValue() + mc2.getValue()));
    System.out.println("Coin1 face: " + mc1.getFace());
    mc1.flip();
    System.out.println("Coin1 new face: " + mc1.toString());
    mc1.flip();
    System.out.println("Coin1 new face: " + mc1.toString());
    mc1.flip();
    System.out.println("Coin1 new face: " + mc1.toString());
    mc1.flip();
    System.out.println("Coin1 new face: " + mc1.toString());
  }
}