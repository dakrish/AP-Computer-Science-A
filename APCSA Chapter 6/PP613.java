import java.applet.Applet;
import java.awt.*;

public class PP613 extends Applet
{
  public void paint(Graphics page)
  {
    int x, y;
    
    for (int row=20; row >= 0; row--)
    {
      y = row * 30;
      x = 600-(row * 30);
      page.drawLine (x, y, x+30, y);
      page.drawLine (x+30, y, x+30, y-30);
    }
  }
}