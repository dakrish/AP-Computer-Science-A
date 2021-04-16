import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class Keypad
{
  public static void main (String[] args)
  {
    JFrame dialFrame = new JFrame ("Calling . . . ");
    dialFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    KeypadPanel gui = new KeypadPanel();
    
    dialFrame.getContentPane().add(gui);
    dialFrame.pack();
    dialFrame.show();
  }
}