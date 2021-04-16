import javax.swing.*;
import java.awt.*;
import java.util.Random;
//Draws 10 randomly located circles, each with a random diameter. All circles are red to fulfill textbook conditions.
public class PP816
{
  public static void main (String[] args) 
  {
    JFrame frame = new JFrame ("PP816");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    PP816Panel panel = new PP816Panel();
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true); 
  } 
}