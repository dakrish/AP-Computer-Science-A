import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class TrafficLight
{
  public static class TrafficPanel extends JPanel
  {
    public Color color;
    public TrafficPanel()
    {
      JButton push = new JButton ("Turn Traffic Light Off");
      push.addActionListener (new ButtonListener());
      color = Color.green;
      add (push);
      
      setPreferredSize (new Dimension(300, 300));
    }
    private class ButtonListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
        color = Color.gray;
        repaint();
      }
    }
    public void paintComponent(Graphics page)
    {
      page.setColor(color);
      page.fillOval(10, 10, 50, 50);
      page.setColor(Color.gray);
      page.fillOval(10, 70, 50, 50);
      page.setColor(Color.gray);
      page.fillOval(10, 130, 50, 50);
    }
  }
  public static void main(String[] args)
  {
    JFrame frame = new JFrame ("Fahrenheit");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TrafficPanel panel = new TrafficPanel();
    
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}