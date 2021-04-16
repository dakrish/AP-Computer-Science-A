//********************************************************************

// RubberLines.java Author: Lewis/Loftus

//

// Demonstrates mouse events and rubberbanding.

//********************************************************************

import javax.swing.*;
import java.awt.*;
  import java.awt.event.*;

public class PP820 extends JFrame

{

//-----------------------------------------------------------------

// Creates and displays the application frame.

//-----------------------------------------------------------------

public static void main(String[] args)

{

JFrame frame = new JFrame("PP820");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.getContentPane().add(new PP820Panel());

frame.pack();

frame.setVisible(true);

}
}