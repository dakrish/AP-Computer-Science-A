//********************************************************************
// RocketPanel.java Author: Lewis/Loftus
//
// Demonstrates the use of polygons and polylines.
//********************************************************************
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
public class PP825Panel extends JPanel
{
//SUBTRACT 15 from all X and 100 from all Y. Then set it to mouse Position + whatever is left from subtraction
  private int[] yRocket = {100, 120, 120, 130, 130, 70, 70, 80, 80};
  private int[] xRocket = {15, 40, 115, 125, 150, 150, 125, 115, 40};
  private int[] yWindow = {95, 105, 110, 90};
  private int[] xWindow = {45, 45, 70, 70};
  private int[] yFlame = {70, 70, 75, 80, 90, 100, 110, 115, 120, 130, 130};
  private int[] xFlame = {155, 170, 165, 190, 170, 175, 160, 185, 160, 175, 155};
  private boolean laserBeamOn = false;
  private Point point1 = null;
  private Point point2 = null;
//-----------------------------------------------------------------
// Constructor: Sets up the basic characteristics of this panel.
//-----------------------------------------------------------------
  public PP825Panel()
  {
    LineListener listener = new LineListener();
    addMouseListener(listener);
    addMouseMotionListener(listener);
    
    setBackground(Color.black);
    setPreferredSize(new Dimension(900, 900));
  }
  public void paintComponent(Graphics page)
  {
    if (point1 != null)
    {
      int[] yRocketNew = {point1.y, point1.y+20, point1.y+20, point1.y+30, point1.y+30, point1.y-30, point1.y-30, point1.y-20, point1.y-20};
      int[] xRocketNew = {point1.x, point1.x+25, point1.x+100, point1.x+110, point1.x+135, point1.x+135, point1.x+110, point1.x+100, point1.x+25};
      int[] yWindowNew = {point1.y-5, point1.y+5, point1.y+10, point1.y-10};
      int[] xWindowNew = {point1.x+30, point1.x+30, point1.x+55, point1.x+55};
      int[] yFlameNew = {point1.y-30, point1.y-30, point1.y-25, point1.y-20, point1.y-10, point1.y, point1.y+10, point1.y+15, point1.y+20, point1.y+30, point1.y+30};
      int[] xFlameNew = {point1.x+140, point1.x+155, point1.x+150, point1.x+175, point1.x+155, point1.x+160, point1.x+145, point1.x+170, point1.x+145, point1.x+160, point1.x+140};
      super.paintComponent(page);
      page.setColor(Color.cyan);
      page.fillPolygon(xRocketNew, yRocketNew, xRocketNew.length);
      page.setColor(Color.gray);
      page.fillPolygon(xWindowNew, yWindowNew, xWindowNew.length);
      page.setColor(Color.red);
      page.fillPolygon(xFlameNew, yFlameNew, xFlameNew.length);
      if (laserBeamOn == true)
      {
        page.fillRect(0,point1.y-2, point1.x, 4);
      }
      else
      {
        page.setColor(Color.black);
        page.fillRect(0,point1.y-2, point1.x, 4);
      }
    }
    else
    {
      super.paintComponent(page);
      page.setColor(Color.cyan);
      page.fillPolygon(xRocket, yRocket, xRocket.length);
      page.setColor(Color.gray);
      page.fillPolygon(xWindow, yWindow, xWindow.length);
      page.setColor(Color.red);
      page.fillPolygon(xFlame, yFlame, xFlame.length);
    }
  }
  private class LineListener implements MouseListener, MouseMotionListener
  {
    public void mouseMoved(MouseEvent event) 
    {
      point1 = event.getPoint();
      repaint();
    }
    public void mouseEntered (MouseEvent event)
    {
      point1 = event.getPoint();
      repaint();
    }
    public void mousePressed(MouseEvent event) 
    {
      laserBeamOn = true;
      repaint();
    }
    public void mouseReleased(MouseEvent event) 
    {
      laserBeamOn = false;
      repaint();
    }
    public void mouseClicked(MouseEvent event) {}
    public void mouseDragged(MouseEvent event) 
    {
      point1 = event.getPoint();
      repaint();
    }
    public void mouseExited(MouseEvent event) {}
  }
}