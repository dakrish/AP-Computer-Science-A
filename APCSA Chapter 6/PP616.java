import java.applet.Applet;
import java.awt.*;

public class PP616 extends Applet
{
  public void paint(Graphics page)
  {
    int yPos = 5;
    int xPos = 5;
    
    for (int count=1; count <= 20; count++)
    {
      yPos = count*20-10;
      page.drawLine (10, yPos, 400, yPos);
      if (count%2==1)
      {
      for (int xLocation=1; xLocation<=8; xLocation++)
      {
        xPos = xLocation*50-10;
        page.drawLine (xPos, yPos, xPos, yPos-20);
      }
      }
      else
      {
      for (int xLocation=1; xLocation<=8; xLocation++)
      {
        xPos = xLocation*50-10;
        page.drawLine (xPos-25, yPos, xPos-25, yPos-20);
      }
      }
    }
  }
}