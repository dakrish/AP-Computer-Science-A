import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ReboundPanel extends JPanel
{
  private final int WIDTH = 300, HEIGHT = 100;
  private final int DELAY = 20, IMAGE_SIZE = 35;
  private int clicks = 0;
  private ImageIcon image;
  private Timer timer;
  private int x, y, moveX, moveY;
  
  public ReboundPanel()
  {
    LineListener listener = new LineListener();
    addMouseListener(listener);
    timer = new Timer(DELAY, new ReboundListener());
    image = new ImageIcon("happyFace.gif");
    x = 0;
    y = 40;
    moveX = moveY = 3;
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.black);
    timer.start();
  }
  
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    image.paintIcon(this, page, x, y);
  }
  
  private class ReboundListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      x += moveX;
      y += moveY;
      if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
        moveX = moveX * -1;
      if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
        moveY = moveY * -1;
      repaint();
    }
  }
  private class LineListener implements MouseListener, MouseMotionListener
  {
    public void mouseClicked(MouseEvent event)
    {
      clicks++;
      if (clicks%2 == 0)
      {
        timer.start();
      }
      else
      {
        timer.stop();
      }
    }
    public void mouseEntered(MouseEvent event){};
    public void mouseExited(MouseEvent event){};
    public void mousePressed(MouseEvent event) {};
    public void mouseReleased(MouseEvent event) {};
    public void mouseDragged(MouseEvent event) {};
    public void mouseMoved(MouseEvent event){};
  }
}