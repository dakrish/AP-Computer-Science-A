import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class PP912Panel extends JPanel
{
  public Creature c1 = new Creature();
  public final int WIDTH = 500, HEIGHT = 500;
  public final int DELAY = 750;
  public Timer timer;
  public int hits;
  public int misses;
  public int x;
  public int y;
  public ImageIcon image;
  public JLabel label;
  public Random rand;
  public PP912Panel()
  {
    image = c1.getPic();
    label = new JLabel ("Hits: " + hits + "      Misses: " + misses);
    add (label);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.white);
    addMouseListener(new HitListener());
    rand = new Random();
  }
  
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    page.setColor(Color.white);
    x = rand.nextInt(450);
    y = rand.nextInt(450);
    image.paintIcon(this, page, x, y);
    page.setColor(Color.black);
  }
  public class HitListener implements MouseListener
  {
    public void mouseClicked(MouseEvent event)
    {
      Rectangle rect = new Rectangle(x, y, 50, 50);
      if (rect.contains(event.getPoint())) 
      { hits++;}
      else 
      { misses++;}
      label.setText("Hits: " + hits + "      Misses: " + misses);
      System.out.println("x" + x + " Y : " + y + " ex" + event.getPoint().x + "ey " + event.getPoint().y);
      repaint();
    }
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event){}
    public void mouseEntered(MouseEvent event){}
    public void mouseExited(MouseEvent event){}
  }
}