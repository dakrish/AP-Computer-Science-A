import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class StarApplet extends JApplet
{
  public void paint(Graphics page)
  {
    public int width, topX, topY;
    class Star{
      public Star(int width1, int topX1, int topY1)
      {
        width = width1;
        topX = topX1;
        topY = topY1;
      }
      public void draw(Graphics page)
      {
        page.drawLine((topX*width), (topY*width), (topX-3)*width, ((topY-10)*width));
        page.drawLine((topX-3)*width, (topY-10)*width, (topX+4)*width, (topY-4)*width);
        page.drawLine((topX+4)*width, (topY-4)*width, (topX-4)*width, (topY-4)*width);
        page.drawLine((topX-4)*width, (topY-4)*width, (topX+3)*width, (topY-10)*width);
        page.drawLine((topX+3)*width, (topY-10)*width, topX*width, (topY*width));
        page.drawLine((topX-8)*width, (topY-6)*width, topX*width, (topY*width));
      }
      Random rand = new Random();
      int x = rand.nextInt(500);
      int y = rand.nextInt(500);
      int z = rand.nextInt(50);
      Star s1 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s2 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s3 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s4 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s5 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s6 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s7 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s8 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s9 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s10 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s11 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s12 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s13 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s14 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s15 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s16 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s17 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s18 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s19 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      Star s20 = new Star(rand.nextInt(500), rand.nextInt(500), rand.nextInt(50));
      
      public void paint(Graphics page)
      {
        super.paint(page);
        setBackground (Color.black);
        page.setColor( Color.RED );
        s1.draw(page);
        s2.draw(page);
        s3.draw(page);
        s4.draw(page);
        s5.draw(page);
        s6.draw(page);
        s7.draw(page);
        s8.draw(page);
        s9.draw(page);
        s10.draw(page);
        s11.draw(page);
        s12.draw(page);
        s13.draw(page);
        s14.draw(page);
        s15.draw(page);
        s16.draw(page);
        s17.draw(page);
        s18.draw(page);
        s19.draw(page);
        s20.draw(page);
      }
    }
  }
}