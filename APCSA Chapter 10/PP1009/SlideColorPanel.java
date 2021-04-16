//********************************************************************
//  SlideColorPanel.java       Authors: Lewis/Loftus
//
//  Represents the slider control panel for the SlideColor program.
//********************************************************************

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SlideColorPanel extends JPanel
{
   private JPanel controls, colorPanel;
   private JSlider rSlider, gSlider, bSlider;
   private JLabel rLabel, gLabel, bLabel;
   private int red, green, blue;
   //-----------------------------------------------------------------
   //  Sets up the sliders and their labels, aligning them along
   //  their left edge using a box layout.
   //-----------------------------------------------------------------
   public SlideColorPanel()
   {
      rSlider = new JSlider(JSlider.HORIZONTAL, -10, 10, 0);
      rSlider.setMajorTickSpacing(5);
      rSlider.setMinorTickSpacing(1);
      rSlider.setPaintTicks(true);
      rSlider.setPaintLabels(true);
      rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

      gSlider = new JSlider(JSlider.HORIZONTAL, -10, 10, 0);
      gSlider.setMajorTickSpacing(5);
      gSlider.setMinorTickSpacing(1);
      gSlider.setPaintTicks(true);
      gSlider.setPaintLabels(true);
      gSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

      bSlider = new JSlider(JSlider.HORIZONTAL, -50, 50, 0);
      bSlider.setMajorTickSpacing(25);
      bSlider.setMinorTickSpacing(1);
      bSlider.setPaintTicks(true);
      bSlider.setPaintLabels(true);
      bSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

      SliderListener listener = new SliderListener();
      rSlider.addChangeListener(listener);
      gSlider.addChangeListener(listener);
      bSlider.addChangeListener(listener);

      rLabel = new JLabel("A value: " + "0");
      rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      gLabel = new JLabel("B value: " + "0");
      gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      bLabel = new JLabel("C value: " + "0");
      bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

      controls = new JPanel();
      BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
      controls.setLayout(layout);
      controls.add(rLabel);
      controls.add(rSlider);
      controls.add(Box.createRigidArea(new Dimension(0, 20)));
      controls.add(gLabel);
      controls.add(gSlider);
      controls.add(Box.createRigidArea(new Dimension(0, 20)));
      controls.add(bLabel);
      controls.add(bSlider);

      colorPanel = new JPanel();
      colorPanel.setPreferredSize(new Dimension(100, 0));
      colorPanel.setBackground(new Color(255, 255, 255));
      
      add(controls);
      add(colorPanel);
   }
   public void paintComponent (Graphics page)
   {
     super.paintComponent(page);
     add(controls);
      add(colorPanel);
     page.drawLine(210,150,310,150);
     page.drawLine(260,100,260,200);
     for (int x = 210; x < 310; x++)
     {
       if ((((((-1*red*(x-260)*(x-260))+(green*(x-260))-blue)+150) <100) || (((-1*red*(x-260)*(x-260))+(green*(x-260))-blue)+150 > 200)) || (((((-1*red*(x+1-260)*(x+1-260))+(green*(x+1-260))-blue)+150) <100) || (((-1*red*(x+1-260)*(x+1-260))+(green*(x+1-260))-blue)+150 > 200)))
       {
         continue;
       }
       else
       {
       page.setColor(Color.RED);
       page.drawLine(x, ((-1*red*(x-260)*(x-260))+(green*(x-260))-blue)+150, x+1, ((-1*red*((x-260)+1)*((x-260)+1))+(green*((x-260)+1))-blue)+150);
       }
     }
   }
   // (260, 150) = (0, 0)
   // -50, 50 x and y ranges

   //*****************************************************************
   //  Represents the listener for all three sliders.
   //*****************************************************************
   private class SliderListener implements ChangeListener
   {
      //--------------------------------------------------------------
      //  Gets the value of each slider, then updates the labels and
      //  the color panel.
      //--------------------------------------------------------------
      public void stateChanged(ChangeEvent event)
      {
         red = rSlider.getValue();
         green = gSlider.getValue();
         blue = bSlider.getValue();

         rLabel.setText("A value: " + red);
         gLabel.setText("B value: " + green);
         bLabel.setText("C value: " + blue);

         repaint();
      }
   }
}
