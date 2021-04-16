import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class Star1 extends JApplet
{
  public void paint(Graphics page)
  {
    class Star{
      int width = 1;
      int topX = 1;
      int topY = 1;
      public Star(int width1, int topX1, int topY1)
      {
        width = width1;
        topX = topX1;
        topY = topY1;
      }
      public void draw(Graphics page)
      {
        page.drawLine((topX*width), ((topY)*width), (topX-3)*width, ((topY+10)*width));
        page.drawLine((topX-3)*width, (topY+10)*width, (topX+4)*width, (topY+4)*width);
        page.drawLine((topX+4)*width, (topY+4)*width, (topX-4)*width, (topY+4)*width);
        page.drawLine((topX-4)*width, (topY+4)*width, (topX+3)*width, (topY+10)*width);
        page.drawLine((topX+3)*width, (topY+10)*width, topX*width, (topY*width));
      }
    }
    
    Random rand = new Random();
    Star s1 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s2 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s3 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s4 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s5 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s6 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s7 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s8 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s9 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s10 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s11 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s12 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s13 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s14 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s15 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s16 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s17 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s18 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s19 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    Star s20 = new Star(10, rand.nextInt(100), rand.nextInt(100));
    
    super.paint(page);
    page.setColor(Color.black);
    page.fillRect(0,0,1000,1000);
    page.setColor(Color.white);
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