//********************************************************************
//  SplatPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of graphical objects.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SplatPanelV3 extends JPanel
{
  private Bar[] bars = new Bar[5];
  private Timer timer;
  int index = 1;
  //-----------------------------------------------------------------
  //  Constructor: Creates five Circle objects.
  //-----------------------------------------------------------------
  public SplatPanelV3()
  {
    timer = new Timer(2000, new TimeListener());
    bars[4] = new Bar (15);
    bars[3] = new Bar (35);
    bars[2] = new Bar (55);
    bars[0] = new Bar (75);
    bars[1] = new Bar (95);
    
    setPreferredSize (new Dimension(300, 200));
    setBackground (Color.black);
    timer.start();
  }
  
  //-----------------------------------------------------------------
  //  Draws this panel by requesting that each bar draw itself.
  //-----------------------------------------------------------------
  public void paintComponent (Graphics page)
  {
    super.paintComponent(page);
    for (int i = 0; i < bars.length; i++)
    { 
      page.setColor(Color.WHITE);
      page.drawLine(i*20+20, 0, i*20+20, bars[i].getHeight()); 
      page.setColor(Color.BLACK);
      page.drawLine(i*20+20, bars[i].getHeight(), i*20+20, 100);
    }
  }
  private class TimeListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      Bar key = bars[index];
      int position = index;
      
      //  Shift larger values to the right
      while (position > 0 && key.compareTo(bars[position-1]) < 0)
      {
        bars[position] = bars[position-1];
        position--;
      }
      
      bars[position] = key;
      index++;
      repaint();
      if (index >= bars.length)
      { timer.stop();}
    }
  }
}
