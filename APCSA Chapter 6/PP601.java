import java.util.Scanner;
public class PP601{
  public static void main(String []args){
    System.out.println("Input the max number!");
    Scanner scan = new Scanner(System.in);
    int num1=scan.nextInt();
    while (num1<=1)
    {
      System.out.println("Whoops! Please enter an integer bigger than 0!");
      num1 = scan.nextInt();
    }
    int total = 0;
    for (int num = 2; num <= num1; num+=2)
    {
      total+=num;
    }
    System.out.println(total);
  }
}