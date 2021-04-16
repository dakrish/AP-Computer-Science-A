import java.applet.Applet;
import java.awt.*;

public class PP612 extends Applet
{
  Color brown = new Color(153,102,0);
  public void paint(Graphics page)
  {
    int xPos, yPos;
    setBackground (brown);
    
    for (int row=1; row <= 8; row++)
    {
      yPos = row * 30;
      if (row%2==0)
      {
        for (int column=1; column <= 8; column++)
        {
          xPos = column * 30;
          if (column%2 == 1)
          {
            page.setColor (Color.white);
          }
          else
          {
            page.setColor (Color.black);
          }
          page.fillRect (xPos, yPos, 30, 30);
        }
      }
      else
      {
        for (int column=1; column <= 8; column++)
        {
          xPos = column * 30;
          if (column%2 == 0)
          {
            page.setColor (Color.white);
          }
          else
          {
            page.setColor (Color.black);
          }
          page.fillRect (xPos, yPos, 30, 30);
        }
      }
    }
  }
}