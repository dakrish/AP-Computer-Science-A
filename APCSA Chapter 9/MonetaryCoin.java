public class MonetaryCoin extends Coin
{
  private int value;
  public MonetaryCoin (int value1)
  {
    value = value1;
    this.flip();
  }
  public int getValue ()
  {
    return this.value;
  }
  public int getFace()
  {
    return this.face;
  }
}