import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class Line
{
  int x = 0;
  public Line() {}
  public void draw(Graphics page, int newX)
  {
    x = newX;
    for (int i = 0; i<50; i++)
    {
      if (x+i > 500)
      {
        page.setColor(Color.RED);
      }
      else
      {
        page.setColor(Color.WHITE);
      }
      page.drawLine(x+i, 200, x+1+i, 200);
    }
  }
}