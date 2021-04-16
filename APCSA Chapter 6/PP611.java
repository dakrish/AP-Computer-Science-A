import java.applet.Applet;
import java.awt.*;

public class PP611 extends Applet
{
   public void paint(Graphics page)
   {
      int yPos = 5;
      int length = 0;

      for (int count=1; count <= 20; count++)
      {
         yPos = count*10+10;

         length = ((int) (Math.random() * 250) + 25);

         page.drawLine (10, yPos, 10+length, yPos);
      }
   }
}