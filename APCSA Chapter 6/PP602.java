import java.util.Scanner;
public class PP602{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    for (int num=0; num <=str.length()-1; num++)
    {
      System.out.println(str.charAt(num));
    }
  }
}