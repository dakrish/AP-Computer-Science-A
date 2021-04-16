import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class Car
{
  int x = 0;
  public Car()
  {
  }
  public int[] getX ()
  {
    int[] temp = {x+50, x+ 80, x+ 110, x+ 140, x+ 260, x+ 290, x+ 320, x+ 350, x+ 350, x+ 290, x+ 220, x+ 180, x+ 50, x + 50, x+ 50}; 
    return temp;
  }
  public int[] getY ()
  {
    int[] temp = {200, 200, 230, 200, 200, 230, 200, 200, 150, 150, 100, 100, 100, 150, 200};
    return temp;
  }
  public void draw(Graphics page, int newX)
  {
    x = newX;
    page.fillPolygon(this.getX(), this.getY(), 15);
  }
}