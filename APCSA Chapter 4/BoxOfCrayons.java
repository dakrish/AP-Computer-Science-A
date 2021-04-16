import javax.swing.JFrame;
public class Building
{
  public static void main (String[] args)
  {
    JFrame frame = new JFrame ("Building");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new BuildingPanel());
    
    frame.pack();
    frame.setVisible(true);
  }
}

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BuildingPanel extends JPanel
{
  private Rectangle rec1, rec2, rec3, rec4;
  private final int NUM_BOXES = 10;
  private final int X = 400, Y = 400;
  private Random generator;
  
  public BuildingPanel()
  {
    generator = new Random();
    rec1 = new Rectangle (40,190,Color.black,20,210);
    rec2 = new Rectangle (50,170,Color.black,90,230);
    rec3 = new Rectangle (70,215,Color.black,170,185);
    rec4 = new Rectangle (90,283,Color.black,310,117);
    
    setPreferredSize (new Dimension (400,400));
    setBackground (Color.blue);
  }
  public void paintComponent (Graphics page)
  {
    super.paintComponent(page);
    
    int x,y,width,height;
    
    rec1.draw(page);
    rec2.draw(page);
    rec3.draw(page);
    rec4.draw(page);
    
    for (int count=0; count< NUM_BOXES; count++)
    {
      x = generator.nextInt(X);
      y = generator.nextInt(Y);
      width = 8;
      height = 8;
      page.setColor (Color.yellow);
      page.fillRect (x, y, width, height);
    }
    
    
  }
}
