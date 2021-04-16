import java.util.Scanner;
public class PP1209 {
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter one number.");
    int num1 = scan.nextInt();
    System.out.println("Corresponding line of Pascal's Triangle: ");
    int[] pascal2 = calcPascal(num1);
    for (int index = 0; index < num1; index++)
    {
      System.out.print(pascal2[index] + " ");
    }
  }
  public static int[] calcPascal(int max)
  {
    int[] currentRow = new int[max+1];
    if(max == 0)
    {
      currentRow[0] = 1;
      return currentRow;
    }
    int[] rowBefore = calcPascal(max-1);
    currentRow[0] = 1;
    for(int i = 1; i < rowBefore.length; i++)
    {
      currentRow[i] = rowBefore[i-1] + rowBefore[i];
    }
    return currentRow;
  }
}
