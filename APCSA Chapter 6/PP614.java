import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class PP614 
{
  public static void main (String[] args) 
  {
    JFrame frame = new JFrame ("PP614");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    CirclesPanel panel = new CirclesPanel();
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true); 
  } 
}
class CirclesPanel extends JPanel 
{
  private final int NUM_CIRCLES = 100, THICKNESS = 5, MAX_DIAMETER = 50;
  private final int MAX_POS = 200;
  private Random generator;
  public CirclesPanel() 
  {
    generator = new Random();
    setBackground(Color.black);
    setPreferredSize(new Dimension(400, 300)); 
  }
  public void paintComponent(Graphics page) 
  {
    super.paintComponent(page);
    int x, y, width, height;
    for (int count = 0; count <= NUM_CIRCLES; count++) 
    {
      int red = (int)(Math.random()*256);
      int green = (int)(Math.random()*256);
      int blue = (int)(Math.random()*256);
      
      Color randomColour = new Color(red,green,blue);
      
      x = generator.nextInt(MAX_POS) + 1;
      y = generator.nextInt(MAX_POS) + 1;
      width = generator.nextInt(MAX_DIAMETER) + 1;
      height = width;
      page.setColor(randomColour);
      page.fillOval(x, y, width+20, height+20);
    } 
  }
}