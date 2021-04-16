public class PP702
{
   public static void main (String[] args)
   {
      Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);

      Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
      studentV2 john = new studentV2 ("John", "Smith", jHome, school, 65, 60, 97);


      Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
      studentV2 marsha = new studentV2 ("Marsha", "Jones", mHome, school);

      System.out.println (john);
      System.out.println ();
      System.out.println (marsha);
      System.out.println ();
      
      //Let's say that we find out that John cheated on the last test . . .
      
      System.out.println ("\"JOHN CHEATED!\" - Marsha (the new student)");
      john.setTestScore(3, 0);
      System.out.println ("John's new test #3 grade: " + john.getTestScore(3));
      
      System.out.println ("John's new average:");
      System.out.println (john.average());
   }
}