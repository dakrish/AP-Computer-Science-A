import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class PP812 extends JApplet
{
  public void paint(Graphics page)
  {  
    Random rand = new Random();
    Star s1 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s2 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s3 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s4 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s5 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s6 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s7 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s8 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s9 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    Star s10 = new Star(rand.nextInt(10), rand.nextInt(100), rand.nextInt(100));
    
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
    
  }
}