public class Course
{
   protected int courseNum = 0;
   protected double courseCredits = 0.00;
   protected String courseName = "";
   protected String courseTeacher = "";

   public Course(){}
   public Course(int num, int creds, String name, String teach)
   {
     courseNum = num;
     courseCredits = creds;
     courseName = name;
     courseTeacher = teach;
   }
   public String toString()
   {
     return ("Course #" + courseNum + ": " + courseName + " taught by " + courseTeacher + ". Credits: " + courseCredits);
   }
   public double getCreds()
   {
     return this.courseCredits;
   }
   public double add(Course course1)
   {
     return this.getCreds()+course1.getCreds();
   }
}