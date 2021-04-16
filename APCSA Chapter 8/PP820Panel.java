import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
public class PP820Panel extends JPanel
{
  Point point1 = null;
  Point point2 = null;
  private Point[] firstPoints = new Point[999];
  private Point[] secondPoints = new Point[999];
  private int clickCount = 0;
  
  public PP820Panel()
  {
    LineListener listener = new LineListener();
    addMouseListener(listener);
    setBackground(Color.black);
    setPreferredSize(new Dimension(400, 200));
  }
  
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    page.setColor(Color.yellow);
    if (firstPoints[clickCount] != null)
    {//**************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **
    // page.drawString((""+clickCount), firstPoints[clickCount].x, firstPoints[clickCount].y);
    // Uncomment the above for a more fun version of he program where the number of clicked goes wherever you click
    // page.drawString((""+clickCount), 200, 100);
    // Uncomment the above for a less fun version that the textbook wants
      // **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME **************** READ ME** 
    }
  }
  
  private class LineListener implements MouseListener, MouseMotionListener
  {
    
    public void mousePressed(MouseEvent event)
    {
      clickCount++;
      point1 = event.getPoint();
      firstPoints[clickCount] = point1;
    }
    
    public void mouseReleased(MouseEvent event)
    {
      point2 = event.getPoint();
      secondPoints[clickCount] = point2;
      repaint();
    }
    
    public void mouseClicked(MouseEvent event) {}
    public void mouseDragged(MouseEvent event) {}
    public void mouseEntered(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {}
    public void mouseMoved(MouseEvent event) {}
  }
}