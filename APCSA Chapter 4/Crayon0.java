import javax.swing.JApplet;
  import java.awt.*;
  import java.applet.*;
  import javax.swing.*;
  public class Crayon0 extends JApplet
{
  public static void main(String[] args)
  {
    class Crayon
    {
      public Crayon(Color color, int length, int x)
      {
        color = color;
        length = length;
        x = x;
      }
      public void draw(Graphics page)
      {
        page.setColor(color);
        page.fillRect(x, 150, 15, length);
      }
      public int getLength()
      {
        return length;
      }
      public Color getColor()
      {
        return color;
      }
    }
    public Crayon c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
    
    c1 = new Crayon(Color.black , 70, 30);
    c2 = new Crayon(Color.blue , 70, 60);
    c3 = new Crayon(Color.cyan , 70, 90);
    c4 = new Crayon(Color.darkGray , 70, 120);
    c5 = new Crayon(Color.gray , 70, 150);
    c6 = new Crayon(Color.green , 70, 180);
    c7 = new Crayon(Color.lightGray , 70, 210);
    c8 = new Crayon(Color.magenta , 70, 240);
    c9 = new Crayon(Color.orange , 70, 270);
    c10 = new Crayon(Color.pink , 70, 300);
    c11 = new Crayon(Color.red , 70, 330);
    c12 = new Crayon(Color.yellow , 70, 360);
    
    public void paintComponent(Graphics page)
    {
      super.paint(page);
      setBackground (Color.white);
      setSize (400, 300);
      c1.draw (page);
      c2.draw (page);
      c3.draw (page);
      c4.draw (page);
      c5.draw (page);
      c6.draw (page);
      c7.draw (page);
      c8.draw (page);
      page.setColor (Color.yellow);
      page.fillRect (45, 150, 245, 90);
      page.setColor (Color.black);
      page.drawString ("Crayola", 150, 200);
    }
  }
}
