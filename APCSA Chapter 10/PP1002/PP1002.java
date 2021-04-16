//********************************************************************
//  Firm.java       Author: Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class PP1002
{
   //-----------------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //  Modified to print vacation data as well
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Staff personnel = new Staff();

      personnel.payday();
   }
}
