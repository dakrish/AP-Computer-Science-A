public class PP607B
{
  public static void main (String[] args)
  {
    for (int row = 0; row < 10; row++)
    {
      for (int spaces = 0; spaces <= 10-row; spaces++)
      {
        System.out.print (" ");
      }
      for (int starCount = 0; starCount <= row; starCount++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}