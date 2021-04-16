import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class PP816Panel extends JPanel 
{
  private int currentMax = -1;
  private Random generator;
  public PP816Panel() 
  {
    generator = new Random();
    setBackground(Color.white);
    setPreferredSize(new Dimension(400, 300)); 
  }
  public void paintComponent(Graphics page) 
  {
    super.paintComponent(page);
    int x, y, diameter;
    Circle[] circles = new Circle[20];
    for (int count = 0; count < 20; count++) 
    {
      x = generator.nextInt(200) + 1;
      y = generator.nextInt(200) + 1;
      diameter = generator.nextInt(50) + 1;
      Circle temp = new Circle(diameter, Color.black, x, y);
      circles[count] = temp;
    }
    for (int countX = 0; countX < 20; countX++) 
    {
      for (int countY = 0; countY < 20; countY++) 
      {
        if (countX != countY)
        {
          circles[countX].isOverlapping(circles[countY]);
        }
      }
    }
    for (int countZ = 0; countZ < 20; countZ++) 
    {
      circles[countZ].draw(page);
    }
  } 
}