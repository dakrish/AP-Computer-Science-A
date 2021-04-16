public class PP607D
{
  public static void main (String[] args)
  {
    for (int row = 1; row <= 10; row+=2)
    {
      for (int space = 1; space <= 9-row; space+=2)
      {
        System.out.print (" ");
      }
      for (int star = 1; star <= row; star+=1)
      {
        System.out.print ("*");
      }
      System.out.println();
    }
    for (int row = 1; row <= 10; row+=2)
    {
      for (int space = 1; space <= row-1; space+=2)
      {
        System.out.print (" ");
      }
      for (int star = 1; star <= 10-row; star+=1)
      {
        System.out.print ("*");
      }
      System.out.println();
    }
  }
}