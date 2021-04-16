import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;


public class DisplayPanel extends JPanel
{
  public JLabel keypadDisplay;
  public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, call, b0, endCall, clear;
  public String keypadText;
  
  public DisplayPanel()
  {
    setLayout(new GridLayout(4, 3));
    
    keypadText = "";
    
    keypadDisplay = new JLabel (keypadText);
    keypadDisplay.setFont (new Font ("Helvetica", Font.BOLD, 24));
    
    b1 = new JButton ("1");
    b1.setBackground (Color.green);
    b1.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b2 = new JButton ("2");
    b2.setBackground (Color.green);
    b2.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b3 = new JButton ("3");
    b3.setBackground (Color.green);
    b3.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b4 = new JButton ("4");
    b4.setBackground (Color.green);
    b4.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b5 = new JButton ("5");
    b5.setBackground (Color.green);
    b5.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b6 = new JButton ("6");
    b6.setBackground (Color.green);
    b6.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b7 = new JButton ("7");
    b7.setBackground (Color.green);
    b7.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b8 = new JButton ("8");
    b8.setBackground (Color.green);
    b8.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b9 = new JButton ("9");
    b9.setBackground (Color.green);
    b9.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    b0 = new JButton ("0");
    b0.setBackground (Color.green);
    b0.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    call = new JButton ("Call");
    call.setBackground (Color.green);
    call.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    endCall = new JButton ("End Call");
    endCall.setBackground (Color.green);
    endCall.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    clear = new JButton ("Clear");
    clear.setBackground (Color.green);
    clear.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    
    ButtonGroup group = new ButtonGroup();
    group.add(b1);
    group.add(b2);
    group.add(b3);
    group.add(b4);
    group.add(b5);
    group.add(b6);
    group.add(b7);
    group.add(b8);
    group.add(b9);
    group.add(call);
    group.add(b0);
    group.add(endCall);
    
    ClickListener listener = new ClickListener();
    b1.addActionListener (listener);
    b2.addActionListener (listener);
    b3.addActionListener (listener);
    b4.addActionListener (listener);
    b5.addActionListener (listener);
    b6.addActionListener (listener);
    b7.addActionListener (listener);
    b8.addActionListener (listener);
    b9.addActionListener (listener);
    b0.addActionListener (listener);
    
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(call);
    add(b0);
    add(endCall);
    
    setBackground (Color.green);
    setPreferredSize (new Dimension(600, 100));
  }
  private class ClickListener implements ActionListener
  {
    public void actionPerformed (ActionEvent event)
    {
      Object source = event.getSource();
      
      if (source == b1)
      {
        keypadText +=1;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b2)
      {
        keypadText +=2;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b3)
      {
        keypadText +=3;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b4)
      {
        keypadText +=4;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b5)
      {
        keypadText +=5;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b6)
      {
        keypadText +=6;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b7)
      {
        keypadText +=7;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b8)
      {
        keypadText +=8;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b9)
      {
        keypadText +=9;
        keypadDisplay.setText (keypadText);
      }
      else
        if (source == b0)
      {
        keypadText +=0;
        keypadDisplay.setText (keypadText);
      }
    }
  }
}