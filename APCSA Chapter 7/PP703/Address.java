public class Address
{
   private String streetAddress, city, state;
   private long zipCode;

   // Sets up this Address object with the specified data.

   public Address (String street, String town, String st, long zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }  // end Address() method

   // Returns this Address object as a String.

   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }  // end toString() method
}