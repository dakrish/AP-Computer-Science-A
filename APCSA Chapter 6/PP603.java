public class PP603
{
  public static void main (String[] args)
  {
    for (int multiplicand = 1; multiplicand <= 12; multiplicand++)
    {
      for (int multiplier = 1; multiplier <= 12; multiplier++)
      {
        System.out.print (multiplicand*multiplier+"\t");
      }
      System.out.println();
    }
  }
}