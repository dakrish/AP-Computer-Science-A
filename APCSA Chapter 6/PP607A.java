public class PP607A
{
  public static void main (String[] args)
  {
    for (int row = 0; row < 10; row++)
    {
      for (int starCount = 1; starCount <= 10-row; starCount++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}