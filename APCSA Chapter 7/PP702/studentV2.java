public class studentV2
{
  private String firstName, lastName;
  private Address homeAddress, schoolAddress;
  private int test1, test2, test3;
  public double average;
  
  public studentV2 (String first, String last, Address home, Address school, int test1Grade, int test2Grade, int test3Grade)
  {
    firstName = first;
    lastName = last;
    homeAddress = home;
    schoolAddress = school;
    test1 = test1Grade;
    test2 = test2Grade;
    test3 = test3Grade;
    average = ((double)(test1+test2+test3))/3;
  }
  public studentV2 (String first, String last, Address home, Address school)
  {
    firstName = first;
    lastName = last;
    homeAddress = home;
    schoolAddress = school;
    test1 = 0;
    test2 = 0;
    test3 = 0;
  }
  
  public String getName() 
  {
    return firstName + " " + lastName;
  }
  
  public String toString()
  {
    String result;
    
    result = firstName + " " + lastName + "\n";
    result += "Home Address:\n" + homeAddress + "\n";
    result += "School Address:\n" + schoolAddress + "\n";
    result += "Test Scores:\n" + test1 + ", " + test2 + ", and " + test3 + "\n";
    result += "Average:\n" + average;
    return result;
  }
  
  public void setTestScore(int testNum, int grade) 
  {
    if (testNum == 1)
    { test1 = grade; }
    if (testNum == 2)
    { test2 = grade; }
    if (testNum == 3)
    { test3 = grade; }
    average = ((double)(test1+test2+test3))/3;
  }
  public int getTestScore(int testNum) 
  {
    int testTemp = 0;
    if (testNum == 1)
    { testTemp = test1; }
    if (testNum == 2)
    { testTemp = test2; }
    if (testNum == 3)
    { testTemp = test3; }
    return testTemp;
  }
  public double average() 
  {
    average = ((double)(test1+test2+test3))/3;
    return average;
  }
}