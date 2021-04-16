public class PP607C
{
  public static void main (String[] args)
  {
    for (int row = 0; row < 10; row++)
    {
      for (int spaces = -1; spaces >= 0-row; spaces--)
      {
        System.out.print (" ");
      }
      for (int starCount = 1; starCount <= 10-row; starCount++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}