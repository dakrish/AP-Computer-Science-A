//*******************************************************************
// Direction.java Author: Lewis/Loftus
//
// Demonstrates key events.
//*******************************************************************
import javax.swing.JFrame;
public class PP827
{
//-----------------------------------------------------------------
// Creates and displays the application frame.
//-----------------------------------------------------------------
  public static void main(String[] args) 
  {
    JFrame frame = new JFrame("PP827");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new PP827Panel());
    frame.pack();
    frame.setVisible(true); 
  }  
}