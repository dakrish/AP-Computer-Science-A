public class PP1207
{
  public static void main(String args[])
  {
    System.out.println("BlurbGen V1");
    System.out.print("Your random blurb: ");
    System.out.println(blurbGen());
  }
  static String blurbGen () 
  {
    String string = whoozitGen() + whatzitGen();
    while (Math.random() - 0.5 >= 0) 
      string += whatzitGen();
    return string;
  }
  static String whoozitGen () 
  {
    String string;
    string = "x";
    while (Math.random() - 0.5 >= 0) 
      string += "y";
    return string;
  }
  static String whatzitGen()
  {
    String s = "q";
    if (Math.random() - 0.5 >= 0) 
      return s + "z" + whoozitGen();
    else
      return s + "d" + whoozitGen();
  }
}
