public class PP703
{
  public static void main (String[] args)
  {
    Course class1 = new Course ("AP Computer Science A");
    Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);
    
    Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
    studentV2 john = new studentV2 ("John", "Smith", jHome, school, 65, 60, 97);
    class1.addStudent(john);
    
    Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
    studentV2 marsha = new studentV2 ("Marsha", "Jones", mHome, school);
    class1.addStudent(marsha);
    
    System.out.println ();
    System.out.println ("Current class average in APCSA: " + class1.average());
    System.out.println ();
    class1.roll();
  }
}