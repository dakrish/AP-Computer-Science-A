import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CarPanel extends JPanel
{
  private Car c1 = new Car();
  private final int WIDTH = 1000, HEIGHT = 400;
  private final int DELAY = 10;
  private Timer timer;
  private int x, moveX;
  
  public CarPanel()
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
    c1.draw(page, x);
  }
  
  private class ReboundListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      x += moveX;
      if (x <= 0 || x >= 600)
        moveX = moveX * -1;
      repaint();
    }
  }
}