import java.util.Random;
import javax.swing.JApplet;
import java.awt.*;
public class Building extends JApplet
{
  private static final long serialVersionUID = 123;
  // Yay! No more warnings or errors!
  public void paint(Graphics page)
  {
    setBackground(Color.cyan);
    
    class  building
    {
      public  building (int width, int height, int xPos)
      {
      }
      public void draw (Graphics page, int width, int height, int xPos)
      {
        int TOP = 250;
        
        page.setColor (Color.lightGray);
        page.fillRect (xPos, TOP - height, width, height);
        
        page.setColor (Color.yellow);
        page.fillRect (xPos+10, TOP - height + 20, 10, 10);
      }
    }
    Random rand = new Random();
    
    building b1, b2, b3, b4;
    
    b1 = new  building(1, 1, 1);
    b2 = new  building(2, 2, 2);
    b3 = new  building(3, 3, 3);
    b4 = new  building(4, 4, 4);
    
    b1.draw(page, (rand.nextInt(25))+25, (rand.nextInt(150))+50, rand.nextInt(50));
    b2.draw(page, (rand.nextInt(25))+25, (rand.nextInt(150))+50, (rand.nextInt(50))+100);
    b3.draw(page, (rand.nextInt(25))+25, (rand.nextInt(150))+50, (rand.nextInt(50))+200);
    b4.draw(page, (rand.nextInt(25))+25, (rand.nextInt(150))+50, (rand.nextInt(50))+300);
    
    page.setColor (Color.green);
    page.fillRect (0, 200, 500, 5000);
    
    setBackground(Color.cyan);
    
  }
}