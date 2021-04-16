import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LinePanel extends JPanel
{
  private Line l1 = new Line();
  private final int WIDTH = 1000, HEIGHT = 400;
  private final int DELAY = 1;
  private Timer timer;
  private int x, moveX;
  
  public LinePanel()
  {
    timer = new Timer(DELAY, new ReboundListener());
    x = 0;
    moveX = 1;
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.black);
    timer.start();
  }
  
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    page.setColor(Color.black);
    page.fillRect(0,0,1000,1000);
    page.setColor(Color.white);
    page.drawLine(500, 0, 500, 400);
    l1.draw(page, x);
  }
  
  private class ReboundListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      x += moveX;
      if (x <= 0 || x >= 950)
        moveX = moveX * -1;
      repaint();
    }
  }
}