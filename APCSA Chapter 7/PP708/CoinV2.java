// New and improved Coin class
public class CoinV2 implements Lockable
{
  public final int HEADS = 0;
  public final int TAILS = 1;
  public int lockCode;
  public boolean locked = true;
  
  private int face;
  
  public CoinV2(int newKey, int newLockCode)
  {
    lockCode = newLockCode;
    flip(newKey);
  }
  
  public void flip(int key)
  {
    if (key == lockCode)
    {
      face = (int) (Math.random() * 2 );
    }
    else {}
  }
  
  public int getFace(int key)
  {
    if (key == lockCode)
    {
      return face;
    }
    else
      return -1;
  }
  
  public String toString(int key)
  {
    if (key == lockCode)
    {
      String faceName;
      if ( face == HEADS)
        faceName = "Heads";
      else
        faceName = "Tails";
      
      return faceName;
    }
    else
      return "error";
  }
  public boolean isLocked()
  {
    return this.locked;
  }
  
  
  public boolean locked()
  {
    return this.isLocked();
  }
  public void unlock(int key)
  {
    if ((key == lockCode)&&(this.locked == true))
    {
      this.locked = false;
    }
    else{}
  }
  public void lock(int key)
  {
    if ((key == lockCode)&&(this.locked == true))
    {
      this.locked = true;
    }
    else {}
  }
  public void setKey(int key)
  {
    lockCode = key;
  }
}