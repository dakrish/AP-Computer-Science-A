import java.util.ArrayList;
public class Course
{
  private int classAverage, numStudentsCounted, numStudentsPrinted;
  private String name;
  private studentV2 student;
  private ArrayList<studentV2> students = new ArrayList<studentV2>();
  int index = 0;
  
  public Course (String nameOfCourse)
  {
    name = nameOfCourse;
  }
  public void addStudent (studentV2 studentName)
  {
    students.add(index, studentName);
    index++;
  }
  public double average ()
  {
    while (numStudentsCounted < students.size())
    {
      student = students.get(numStudentsCounted);
      classAverage += student.average();
      numStudentsCounted++;
    }
    classAverage /= students.size();
    numStudentsCounted = 0;
    return classAverage;
  }
  public void roll()
  {
    System.out.println("The following students are in this class:");
    while (numStudentsPrinted < students.size())
    {
      student = students.get(numStudentsPrinted);
      System.out.println(student.getName());
      numStudentsPrinted++;
    }
    numStudentsPrinted = 0;
  }
}

