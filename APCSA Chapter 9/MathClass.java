public class MathClass extends Course
{
  private String amountOfCalc;
  public MathClass(){}
   public MathClass(int num, double creds, String name, String teach, String calculusLevels)
   {
     courseNum = num;
     courseCredits = creds;
     courseName = name;
     courseTeacher = teach;
     amountOfCalc = calculusLevels;
   }
   public String print()
   {
     return (this.toString()+" Amount of Calculus Background Knowledge Required: " + amountOfCalc);
   }
}