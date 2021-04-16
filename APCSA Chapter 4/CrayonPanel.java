import javax.swing.*;
import java.awt.*;

public class CrayonPanel extends JPanel{
  
  private Crayon c1, c2, c3, c4, c5;
  
   public CrayonPanel()
   {
      c1 = new Crayon (Color.red, 70, 35);
      c2 = new Crayon (Color.green, 55, 20);
      c3 = new Crayon (Color.cyan, 80, 85);
      c4 = new Crayon (Color.yellow, 50, 30);
      c5 = new Crayon (Color.blue, 40, 60);

      setPreferredSize (new Dimension(300, 200));
      setBackground (Color.black);
   }
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);

      c1.draw(page);
      c2.draw(page);
      c3.draw(page);
      c4.draw(page);
      c5.draw(page);
   }
  
}
