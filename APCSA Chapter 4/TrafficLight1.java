import javax.swing.*;

import java.awt.*;
import java.awt.event.*; 

public class TrafficLight1
{
  public static void main (String[] args)
  {
    JFrame lightFrame = new JFrame ("Traffic Light");
    lightFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    lightFrame.getContentPane().add (new TrafficControlPanel());
    lightFrame.setSize(300, 300);
    lightFrame.show();
  }
}
class TrafficControlPanel extends JPanel
{
  TrafficLightPanel light;
  public TrafficControlPanel()
  {
    light = new TrafficLightPanel();
    add(light);
    JButton push = new JButton("Change Light");
    push.addActionListener(new pushListener());
    add(push);
  }
  class pushListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      light.change();
    }
  }
}
class TrafficLightPanel extends JPanel
{
  private int currentState = 0;
  public void TrafficLightPanel()
  {
    setPreferredSize(new Dimension(300, 300));
  }
  public Dimension getPreferredSize()
  {
    return new Dimension(300, 300);
  }
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    int lightOn = currentState % 3;
    setBackground(Color.white);
    page.setColor(Color.lightGray);
    page.fillRect(50, 10, 50, 130);
    if (lightOn == 0)
      page.setColor(Color.red);
    else
      page.setColor(Color.darkGray);
    page.fillOval(60, 20, 30, 30);
    if (lightOn == 1)
      page.setColor(Color.yellow);
    else
      page.setColor(Color.darkGray);
    page.fillOval(60, 60, 30, 30);
    if (lightOn == 2)
      page.setColor(Color.green);
    else
      page.setColor(Color.darkGray);
    page.fillOval(60, 100, 30, 30);
  }
  public void change()
  {
    currentState++;
    repaint();
  }
}