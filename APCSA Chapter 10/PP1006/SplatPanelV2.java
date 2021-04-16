//********************************************************************
//  SplatPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of graphical objects.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SplatPanelV2 extends JPanel
{
  private Bar[] bars = new Bar[5];
  private Timer timer;
  int index = 0;
  //-----------------------------------------------------------------
  //  Constructor: Creates five Circle objects.
  //-----------------------------------------------------------------
  public SplatPanelV2()
  {
    timer = new Timer(2000, new TimeListener());
    bars[4] = new Bar (15);
    bars[0] = new Bar (35);
    bars[3] = new Bar (55);
    bars[1] = new Bar (75);
    bars[2] = new Bar (95);
    
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
      int min;
      Bar temp;
      if (index >= bars.length-1)
      {
        timer.stop();
      }
      else
      {
        min = index;
        for (int scan = index+1; scan < bars.length; scan++)
        {
          if (bars[scan].compareTo(bars[min]) < 0)
          { min = scan;}
        }
        // Swap the values
        temp = bars[min];
        bars[min] = bars[index];
        bars[index] = temp;
      }
      index++;
      repaint();
    }
  }
}
