//********************************************************************
//  Circle.java       Author: Lewis/Loftus
//
//  Represents a circle with a particular position, size, and color.
//********************************************************************

import java.awt.*;

public class Bar implements Comparable
{
   private int height;
   //-----------------------------------------------------------------
   //  Constructor: Sets up this circle with the specified values.
   //-----------------------------------------------------------------
   public Bar (int x)
   {
      height = x;
   }

   //-----------------------------------------------------------------
   //  X accessor.
   //-----------------------------------------------------------------
   public int getHeight ()
   {
      return height;
   }
   
   public boolean equals(Object other)
   {
      return (height == ((Bar)(other)).getHeight());
   }

   //-----------------------------------------------------------------
   //  Uses both last and first names to determine ordering.
   //-----------------------------------------------------------------
   public int compareTo(Object other)
   {
     return (height - ((Bar)(other)).getHeight());
   }
}