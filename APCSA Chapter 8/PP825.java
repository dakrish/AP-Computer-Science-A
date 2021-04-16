//********************************************************************

// Rocket.java Author: Lewis/Loftus

//

// Demonstrates the use of polygons and polylines.

//********************************************************************

import javax.swing.JFrame;

public class PP825

{

//-----------------------------------------------------------------

// Creates the main frame of the program.

//-----------------------------------------------------------------

public static void main(String[] args)

{

JFrame frame = new JFrame("Rocket");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

PP825Panel panel = new PP825Panel();

frame.getContentPane().add(panel);

frame.pack();

frame.setVisible(true);

}

}