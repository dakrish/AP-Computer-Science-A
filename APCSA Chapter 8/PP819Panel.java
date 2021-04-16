import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PP819Panel extends JPanel 
{
  private ArrayList<Point> pointList;
  private JButton clear;
  public PP819Panel() 
  {
    pointList = new ArrayList<Point>();
    addMouseListener(new DotsListener());
    setBackground(Color.black);
    setPreferredSize(new Dimension(300, 200)); 
    
    clear = new JButton ("Clear");
    clear.addActionListener( new ButtonListener());
    add(clear);
  }
//-----------------------------------------------------------------
// Draws all of the dots stored in the list.
//-----------------------------------------------------------------
  public void paintComponent(Graphics page) 
  {
    super.paintComponent(page);
    page.setColor(Color.green);
    int index = 0;
    for (; index < pointList.size()-1; index++)
    {
      page.drawLine(pointList.get(index).x, pointList.get(index).y, pointList.get(index+1).x, pointList.get(index+1).y);
      if (index%2 == 1)
        page.setColor(Color.black);
      else
        page.setColor(Color.green);
    }
  }
  private class ButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      pointList.clear();
      repaint();
    }
  }
  private class DotsListener implements MouseListener 
  {
//--------------------------------------------------------------
// Adds the current point to the list of points and redraws
// the panel whenever the mouse button is pressed.
//--------------------------------------------------------------
    public void mousePressed(MouseEvent event) 
    {
      pointList.add(event.getPoint()); 
    }
    public void mouseReleased(MouseEvent event)
    {
      pointList.add(event.getPoint());
      repaint();
    }
//--------------------------------------------------------------
// Provide empty definitions for unused event methods.
//--------------------------------------------------------------
    public void mouseClicked(MouseEvent event) {}
    public void mouseEntered(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {} 
  }  
}