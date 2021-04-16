//********************************************************************
//  MazeSearch.java       Author: Lewis/Loftus
//
//  Demonstrates recursion.
//********************************************************************

public class PP1203
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, attempts to
   //  solve it, and prints out its final form.
   //  NOTE: Expand the Interactions Panel to take up about 1/2 to 1/3 of your screen (vertically) for optimal viewing experience
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Maze2D labyrinth = new Maze2D();
      
      System.out.println (labyrinth);

      if (labyrinth.traverse (0, 0))
         System.out.println ("The maze was successfully traversed!");
      else
         System.out.println ("There is no possible path.");

      System.out.println (labyrinth);
   }
}
