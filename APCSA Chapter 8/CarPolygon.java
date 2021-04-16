import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class CarPolygon
{
  public CarPolygon()
  {
  }
  public int[] getX ()
  {
    int[] temp = {50, 80, 110, 140, 260, 290, 320, 350, 350, 290, 220, 180, 50, 50, 50}; 
    return temp;
  }
  public int[] getY ()
  {
    int[] temp = {200, 200, 230, 200, 200, 230, 200, 200, 150, 150, 100, 100, 100, 150, 200};
    return temp;
  }
  public void draw(Graphics page)
  {
    Polygon carPolygon = new Polygon(this.getX(), this.getY(), 15);
    page.drawPolygon(carPolygon);
  }
}