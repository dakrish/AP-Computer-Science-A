import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class PP814 extends JApplet
{
  public void paint(Graphics page)
  {  
    Car c1 = new Car();
    // Draws a square-tired SUV in space
    super.paint(page);
    page.setColor(Color.black);
    page.fillRect(0,0,1000,1000);
    page.setColor(Color.white);
    c1.draw(page);
    
  }
}