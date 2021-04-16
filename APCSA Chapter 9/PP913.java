import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class PP913
{
  public static class PushCounterPanel extends JPanel
  {
    // Code Adapted from PP416
    private static final long serialVersionUID = 123;
    private int count;
    private boolean active = true;
    private JButton on;
    private JButton reset;
    private JLabel label;
    private Timer timer;
    public PushCounterPanel ()
    {
      count = 0;
      
      on = new JButton ("Start / Stop");
      on.addActionListener (new TimeListener());
      
      reset = new JButton ("Reset");
      reset.addActionListener (new ResetListener());
      
      label = new JLabel ("Time: " + count);
      
      timer = new Timer(100, new TickTockListener());
      timer.start();
      
      add (on);
      add (label);
      add (reset);
      
      setPreferredSize (new Dimension(300, 40));
      setBackground (Color.cyan);
    }
    private class TimeListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
        if (active == true)
        { 
          timer.stop();
          active = false;
        }
        else
        { 
          timer.start();
          active = true;
        }
        label.setText("Time: " + ((double)(count))/10);
      }
    }
    private class ResetListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
        timer.stop();
        active = false;
        count = 0;
        label.setText("Time: " + ((double)(count))/10);
      }
    }
    private class TickTockListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
        count += 1;
        label.setText("Time: " + ((double)(count))/10);
      }
    }
  }
  
  public static void main (String[] args)
  {
    JFrame frame = new JFrame ("Timer");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new PushCounterPanel());
    
    frame.pack();
    frame.setVisible(true);
  }
}
