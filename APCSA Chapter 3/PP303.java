import java.text.DecimalFormat;
import java.util.Random;
public class PP303
{
  public static void main(String[] args)
  {
    
    System.out.println("Welcome to Randome Phone Number Generator!");
    
    Random rand = new Random();
    
    DecimalFormat fmt = new DecimalFormat("000");
    DecimalFormat fmt2 = new DecimalFormat("0000");
    
    int nums1 = rand.nextInt(8);
    int nums2 = rand.nextInt(8);
    int nums3 = rand.nextInt(8);
    int numSet1 = rand.nextInt(655);
    int numSet2 = rand.nextInt(10000);
   
    System.out.println("Your phone number is " + nums1 + nums2 + nums3 + "-" + (fmt.format(numSet1)) + "-" + (fmt2.format(numSet2)));

  }

}