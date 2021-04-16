import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
public class PP823Panel extends JPanel
{
  Point point1 = null;
  Point point2 = null;
  private double distanceTraveled = 0.0;
  
  public PP823Panel()
  {
    LineListener listener = new LineListener();
    addMouseListener(listener);
    addMouseMotionListener(listener);
    setBackground(Color.black);
    setPreferredSize(new Dimension(400, 200));
  }
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    page.setColor(Color.yellow);
    String distanceString = "Pixels traveled: "+ distanceTraveled;
    page.drawString((distanceString), point1.x, point1.y);
    System.out.println(distanceTraveled);
  }
  
  private class LineListener implements MouseListener, MouseMotionListener
  {
    public void mouseMoved(MouseEvent event) 
    {
      point1 = event.getPoint();
      if (point1!= null && point2 != null)
      {
        distanceTraveled += Math.pow((((point1.x-point2.x)*(point1.x-point2.x))+((point1.y-point2.y)*(point1.y-point2.y))), 0.5);
        repaint();
      }
      point2 = point1;
    }
    public void mouseEntered (MouseEvent event)
    {
      point2 = event.getPoint();
    }
    public void mousePressed(MouseEvent event) {}
    public void mouseReleased(MouseEvent event) {}
    public void mouseClicked(MouseEvent event) {}
    public void mouseDragged(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {}
  }
}