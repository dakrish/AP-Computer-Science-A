import javax.swing.JApplet;
import java.awt.*;
public class CrayonBox extends JApplet
{
  private static final long serialVersionUID = 123;
  // Yay! No more warnings or errors!
  public void paint(Graphics page)
  {
    class Crayon
    {
      public Crayon (Color color, int length, int position)
      {
      }
      public void draw (Graphics page, Color color, int length, int position)
      {
        int BOTTOM = 150;
        int WIDTH = 25;
          
        page.setColor (color);
        page.fillRect (position, BOTTOM - length, WIDTH, length);
      }
    }
    
    Crayon c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
    c1 = new Crayon(Color.black, 70, 30);
    c2 = new Crayon(Color.blue, 70, 60);
    c3 = new Crayon(Color.cyan, 70, 90);
    c4 = new Crayon(Color.darkGray, 70, 120);
    c5 = new Crayon(Color.gray, 70, 150);
    c6 = new Crayon(Color.green, 70, 180);
    c7 = new Crayon(Color.lightGray, 70, 210);
    c8 = new Crayon(Color.magenta, 70, 240);
    c9 = new Crayon(Color.orange, 70, 270);
    c10 = new Crayon(Color.pink, 70, 300);
    c11 = new Crayon(Color.red, 70, 330);
    c12 = new Crayon(Color.yellow, 70, 360);
    setBackground (Color.white);
    setSize (400, 400);
    c1.draw(page, Color.black, 70, 30);
    c2.draw(page, Color.blue, 70, 60);
    c3.draw(page, Color.cyan, 70, 90);
    c4.draw(page, Color.darkGray, 70, 120);
    c5.draw(page, Color.gray, 70, 150);
    c6.draw(page, Color.green, 70, 180);
    c7.draw(page, Color.lightGray, 70, 210);
    c8.draw(page, Color.magenta, 70, 240);
    c9.draw(page, Color.orange, 70, 270);
    c10.draw(page, Color.pink, 70, 300);
    c11.draw(page, Color.red, 70, 330);
    c12.draw(page, Color.yellow, 70, 360);
    
    page.setColor (Color.yellow);
    page.fillRect (15, 150, 375, 90);
    page.setColor (Color.black);
    page.drawString ("Crayola Crayon Box (12-Pack!)", 117, 200);
  }
}