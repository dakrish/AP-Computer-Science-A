import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class Star
{
  int width = 1;
  int topX = 1;
  int topY = 1;
  int[] temp;
  public Star(int width1, int topX1, int topY1)
  {
    width = width1;
    topX = topX1;
    topY = topY1;
    int[] starCoordsX = {(topX*width), ((topX-3)*width), ((topX+4)*width), ((topX-4)*width), ((topX+3)*width), (topX*width)};
    int[] starCoordsY = {((topY)*width), ((topY+10)*width), ((topY+4)*width), ((topY+4)*width), ((topY+10)*width), ((topY)*width)};
  }
  public int[] getX ()
  {
    int[] temp = {(topX*width), ((topX-3)*width), ((topX+4)*width), ((topX-4)*width), ((topX+3)*width), (topX*width)};
    return temp;
  }
  public int[] getY ()
  {
    int[] temp = {((topY)*width), ((topY+10)*width), ((topY+4)*width), ((topY+4)*width), ((topY+10)*width), ((topY)*width)};
    return temp;
  }
  public void draw(Graphics page)
  {
    page.fillPolygon(this.getX(), this.getY(), 6);
  }
}