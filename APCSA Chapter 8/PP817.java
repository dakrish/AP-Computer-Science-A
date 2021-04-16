import java.applet.Applet;
import java.awt.*;

public class PP817 extends Applet
{
  Color brown = new Color(153,102,0);
  int [][] checkers = {{3, 0, 3, 0, 3, 0, 3, 0}, 
                       {0, 3, 0, 3, 0, 3, 0, 3}, 
                       {1, 0, 1, 0, 1, 0, 1, 0}, 
                       {0, 5, 0, 5, 0, 5, 0, 5},
                       {1, 0, 1, 0, 5, 0, 1, 0},
                       {0, 1, 0, 1, 0, 1, 0, 1}, 
                       {1, 0, 1, 0, 1, 0, 1, 0},
                       {0, 1, 0, 1, 0, 1, 0, 1}};
  //  element%2 = 0 = white square
  //  element%2 = 1 = green square
  //  element = 3 = black checker
  //  element = 5 = red checker
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
            page.setColor (Color.green);
          }
          page.fillRect (xPos, yPos, 30, 30);
          if ((row <= 2) && (column%2 == 0))
          {
            page.setColor (Color.black);
            page.fillOval (xPos, yPos, 30, 30);
          }
          if ((row == 4) && (column%2 == 0))
          {
            page.setColor (Color.red);
            page.fillOval (xPos, yPos, 30, 30);
          }
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
            page.setColor (Color.green);
          }
          page.fillRect (xPos, yPos, 30, 30);
          if ((row <= 2) && (column%2 == 1))
          {
            page.setColor (Color.black);
            page.fillOval (xPos, yPos, 30, 30);
          }
          if ((row == 5) && (column == 5))
          {
            page.setColor (Color.red);
            page.fillOval (xPos, yPos, 30, 30);
          }
        }
      }
    }
  }
}