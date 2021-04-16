import java.applet.Applet;
import java.awt.*;

public class PP617 extends Applet
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
            page.setColor (Color.magenta);
            page.fillOval (xPos, yPos, 30, 30);
            page.setColor (Color.black);
          }
          else
          {
            page.setColor (Color.red);
            page.fillOval (xPos, yPos, 30, 30);
            page.setColor (Color.white);
          }
          page.drawLine (xPos, yPos, xPos+30, yPos+30);
          page.drawLine (xPos+30, yPos, xPos, yPos+30);
          page.drawLine (xPos, yPos+15, xPos+30, yPos+15);
          page.drawLine (xPos+15, yPos, xPos+15, yPos+30);
        }
      }
      else
      {
        for (int column=1; column <= 8; column++)
        {
          xPos = column * 30;
          if (column%2 == 1)
          {
            page.setColor (Color.orange);
            page.fillOval (xPos, yPos, 30, 30);
            page.setColor (Color.white);
          }
          else
          {
            page.setColor (Color.cyan);
            page.fillOval (xPos, yPos, 30, 30);
            page.setColor (Color.black);
          }
          page.drawLine (xPos, yPos, xPos+30, yPos+30);
          page.drawLine (xPos+30, yPos, xPos, yPos+30);
          page.drawLine (xPos, yPos+15, xPos+30, yPos+15);
          page.drawLine (xPos+15, yPos, xPos+15, yPos+30);
        }
      }
    }
  }
}