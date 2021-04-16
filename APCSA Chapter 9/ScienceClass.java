public class ScienceClass extends Course
{
  private String scientificDiscipline;
  public ScienceClass(){}
   public ScienceClass(int num, double creds, String name, String teach, String field)
   {
     courseNum = num;
     courseCredits = creds;
     courseName = name;
     courseTeacher = teach;
     scientificDiscipline = field;
   }
   public String print()
   {
     return (this.toString()+" Discipline: " + scientificDiscipline);
   }
}