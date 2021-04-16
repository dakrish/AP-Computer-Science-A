public class PP908
{
  public static void main(String[] args)
  {
    //(int num, double creds, String name, String teach, String field)
    ScienceClass bio = new ScienceClass(2200, 1.5, "AP BIO", "Galuska", "Biological Sciences");
    MathClass preCalc = new MathClass(3100, 1, "Pre-Calc Honors", "Litke", "Extremely Little (if any)");
    System.out.println(bio.print());
    System.out.println(preCalc.print());
    System.out.println("Total Credits: " + bio.add(preCalc));
  }
}