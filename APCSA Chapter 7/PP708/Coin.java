//Lewis Loftus Coin java from Chapter 5
public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;
    
    private int face;
    
    public Coin()
    {
        flip();
    }
    
    public void flip()
    {
        face = (int) (Math.random() * 2 );
    }
    
    public int getFace()
    {
        return face;
    }
    
    public String toString()
    {
        String faceName;
        if ( face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
            
        return faceName;
    }
}