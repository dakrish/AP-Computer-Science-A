import java.awt.*;
public class Crayon
{
  private final int BOTTOM = 150;
  private final int WIDTH = 25;
  private Color color = Color.black;
  private int length, location;
  public Crayon (Color color, int length, int position)
  {
    color = color;
    length = length;
    location = position;
  }
  public void draw (Graphics page)
  {
    page.setColor (color);
    page.fillRect (location, BOTTOM - length, WIDTH, length);
  }
}