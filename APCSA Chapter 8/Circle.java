import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Circle
// made by Lewis / Loftus
{
  private int diameter, x, y;
  private Color color;
  
  //-----------------------------------------------------------------
  //  Constructor: Sets up this circle with the specified values.
  //-----------------------------------------------------------------
  public Circle (int size, Color shade, int upperX, int upperY)
  {
    diameter = size;
    color = shade;
    x = upperX;
    y = upperY;
  }
  public Circle ()
  {
    diameter = 0;
    color = Color.black;
    x = 0;
    y = 0;
  }
  //-----------------------------------------------------------------
  //  Draws this circle in the specified graphics context.
  //-----------------------------------------------------------------
  public void draw (Graphics page)
  {
    page.setColor (this.getColor());
    page.drawOval (x, y, diameter, diameter);
  }
  
  //-----------------------------------------------------------------
  //  Diameter mutator.
  //-----------------------------------------------------------------
  public void setDiameter (int size)
  {
    diameter = size;
  }
  
  //-----------------------------------------------------------------
  //  Color mutator.
  //-----------------------------------------------------------------
  public void setColor (Color shade)
  {
    color = shade;
  }
  
  //-----------------------------------------------------------------
  //  X mutator.
  //-----------------------------------------------------------------
  public void setX (int upperX)
  {
    x = upperX;
  }
  
  
  //-----------------------------------------------------------------
  //  Y mutator.
  //-----------------------------------------------------------------
  public void setY (int upperY)
  {
    y = upperY;
  }
  
  //-----------------------------------------------------------------
  //  Diameter accessor.
  //-----------------------------------------------------------------
  public int getDiameter ()
  {
    return diameter;
  }
  
  //-----------------------------------------------------------------
  //  Color accessor.
  //-----------------------------------------------------------------
  public Color getColor ()
  {
    return color;
  }
  
  //-----------------------------------------------------------------
  //  X accessor.
  //-----------------------------------------------------------------
  public int getX ()
  {
    return x;
  }
  
  //-----------------------------------------------------------------
  //  Y accessor.
  //-----------------------------------------------------------------
  public int getY ()
  {
    return y;
  }
  public void isOverlapping(Circle c2) 
  {
    double radiusC1 = (((double)this.getDiameter())/2);
    double radiusC2 = (((double)c2.getDiameter())/2);
    double centerXC1 = (this.getX() + (((double)this.getDiameter())/(2)));
    double centerXC2 = (c2.getX() + (((double)c2.getDiameter())/(2)));
    double centerYC1 = (this.getY() + (((double)this.getDiameter())/(2)));
    double centerYC2 = (c2.getY() + (((double)c2.getDiameter())/(2)));
    double distanceBetween = Math.pow((((centerXC1 - centerXC2) * (centerXC1 - centerXC2)) + ((centerYC1 - centerYC2) * (centerYC1 - centerYC2))), 0.5);
    if (distanceBetween <= (radiusC1 + radiusC2))
    {
      this.setColor(Color.cyan);
      c2.setColor(Color.cyan);
    }
    else
    {}
  }
}