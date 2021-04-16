import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
public class PP824Panel extends JPanel
{
  Point point1 = null;
  private boolean green = true;
  private boolean red = false;
  
  public PP824Panel()
  {
    LineListener listener = new LineListener();
    addMouseListener(listener);
    addMouseMotionListener(listener);
    setBackground(Color.green);
    setPreferredSize(new Dimension(400, 400));
  }
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    if (green == true)
    {
      page.setColor(Color.green);
    }
    else
    {
      page.setColor(Color.red);
    }
    page.fillRect(0,0,400,400);
  }
  
  private class LineListener implements MouseListener, MouseMotionListener
  {
    public void mouseMoved(MouseEvent event) 
    {
      point1 = event.getPoint();
      if (point1!= null)
      {
        if (point1.x <= 200)
        {
          green = true;
          red = false;
        }
        else
        {
          green = false;
          red = true;
        }
        repaint();
      }
    }
    public void mouseEntered (MouseEvent event)
    {
      point1 = event.getPoint();
      if (point1.x <= 200)
        {
          green = true;
          red = false;
        }
        else
        {
          green = false;
          red = true;
        }
        repaint();
      repaint();
    }
    public void mousePressed(MouseEvent event) {}
    public void mouseReleased(MouseEvent event) {}
    public void mouseClicked(MouseEvent event) {}
    public void mouseDragged(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {}
  }
}