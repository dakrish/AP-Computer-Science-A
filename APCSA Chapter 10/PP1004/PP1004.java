//********************************************************************
//  Firm.java       Author: Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class PP1004
{
   //----------------------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //  Modified to print only their names in reverse alphabetical order
   //  NOTE: GO INTO STAFF.JAVA TO TOGGLE SELECTION SORT OT INSERTION SORT
   //----------------------------------------------------------------------
   public static void main (String[] args)
   {
      Staff personnel = new Staff();

      personnel.payday();
   }
}
