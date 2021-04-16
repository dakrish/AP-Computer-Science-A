import java.awt.*;
import javax.swing.*;

public class IntroPanel extends JPanel
{
   //-----------------------------------------------------------------
   //  Sets up this panel with two labels.
   //-----------------------------------------------------------------
   public IntroPanel()
   {
      setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));

      setBackground(Color.green);

      JButton b1 = new JButton("Layout Manager Demonstration");
      JButton b2 = new JButton("Choose a tab to see an example of " + "a layout manager.");

      add(Box.createVerticalGlue());
      add(b1);  
      add(Box.createRigidArea(new Dimension (0, 10)));
      add(b2);
      add(Box.createVerticalGlue());
   }
}