import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class PushCounter
{
  public static class PushCounterPanel extends JPanel
  {
    private static final long serialVersionUID = 123;
    private int count;
    private JButton push;
    private JButton push2;
    private JLabel label;
    
    public PushCounterPanel ()
    {
      count = 0;
      
      push = new JButton ("Push Me ++!");
      push.addActionListener (new PlusListener());
      
      push2 = new JButton ("Push Me --!");
      push2.addActionListener (new MinusListener());
      
      label = new JLabel ("Pushes: " + count);
      
      add (push);
      add (label);
      add (push2);
      
      setPreferredSize (new Dimension(300, 40));
      setBackground (Color.cyan);
    }
    private class MinusListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
        count--;
        label.setText("Pushes: " + count);
      }
    }
    private class PlusListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
        count++;
        label.setText("Pushes: " + count);
      }
    }
  }
  
  public static void main (String[] args)
  {
    JFrame frame = new JFrame ("Push Counter");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new PushCounterPanel());
    
    frame.pack();
    frame.setVisible(true);
  }
}
