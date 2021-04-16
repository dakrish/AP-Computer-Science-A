import java.applet.Applet;
import java.awt.*;

public class PP218 extends Applet
{
   //-----------------------------------------------------------------
   //  Draws Olympic Logo
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      

      setBackground (Color.gray);

      page.setColor (Color.white);
      page.drawString ("A Little House", 0, 10);
      
      page.fillRect (50,125,250,125);
     
      page.setColor (Color.yellow);
      page.fillOval (60,40,40,40);
      page.setColor (Color.gray);
      page.fillOval (70,50,20,20);
      
      page.setColor (Color.black);
      page.fillOval (80,20,40,40);
      page.setColor (Color.gray);
      page.fillOval (90,30,20,20);
      
      page.setColor (Color.green);
      page.fillOval (100,40,40,40);
      page.setColor (Color.gray);
      page.fillOval (110,50,20,20);
      
      page.setColor (Color.red);
      page.fillOval (120,20,40,40);
      page.setColor (Color.gray);
      page.fillOval (130,30,20,20);
      
      page.setColor (Color.green);
      page.fillRect (0, 250, 500, 50);
     
   }
}
