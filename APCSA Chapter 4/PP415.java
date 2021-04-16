import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class RandomButton
{
  public static class PushCounterPanel extends JPanel
  {
    private static final long serialVersionUID = 123;
    private int count;
    private JButton push;
    private JLabel label;
    
    public PushCounterPanel ()
    {
      count = 0;
      
      push = new JButton ("Push Me To Generate A Random Number!");
      push.addActionListener (new PlusListener());
      
      label = new JLabel ("Pushes: " + count);
      
      add (push);
      add (label);
      
      setPreferredSize (new Dimension(900, 40));
      setBackground (Color.cyan);
    }
    private class PlusListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
        count = (int)(Math.random()*101);
        label.setText("Your Number: " + count);
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
