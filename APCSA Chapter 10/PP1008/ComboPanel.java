import javax.swing.*;
import javax.swing.event.*; 
import java.awt.*;
import java.awt.event.*;

public class ComboPanel extends JPanel
{
  private JPanel controls;
   private JSlider rSlider;
   private JLabel rLabel;
  private JLabel quote;
  private JRadioButton comedy, philosophy, carpentry;
  private String comedyQuote, philosophyQuote, carpentryQuote;
  private JCheckBox bold, italic;
  private int style, red;
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and a set of radio buttons
  //  that control its text.
  //-----------------------------------------------------------------
  public ComboPanel()
  {
    int red = 24;
    rSlider = new JSlider(JSlider.HORIZONTAL, 24, 30, 24);
      rSlider.setMajorTickSpacing(2);
      rSlider.setMinorTickSpacing(1);
      rSlider.setSnapToTicks(true);
      rSlider.setPaintTicks(true);
      rSlider.setPaintLabels(true);
      rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

      SliderListener listener3 = new SliderListener();
      rSlider.addChangeListener(listener3);

      rLabel = new JLabel("Size: 24");
      rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

      controls = new JPanel();
      BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
      controls.setLayout(layout);
      controls.add(rLabel);
      controls.add(rSlider);
      
    comedyQuote =     "Take my wife, please.";
    philosophyQuote = "I think, therefore I am.";
    carpentryQuote =  "Measure 2x. Cut once.";
    
    quote = new JLabel (comedyQuote);
    quote.setFont (new Font ("Helvetica", Font.PLAIN, red));
    
    comedy = new JRadioButton ("Comedy", true);
    comedy.setBackground (Color.green);
    philosophy = new JRadioButton ("Philosophy");
    philosophy.setBackground (Color.green);
    carpentry = new JRadioButton ("Carpentry");
    carpentry.setBackground (Color.green);
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.green);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.green);
    
    ButtonGroup group = new ButtonGroup();
    group.add (comedy);
    group.add (philosophy);
    group.add (carpentry);
    
    QuoteListener listener = new QuoteListener();
    comedy.addActionListener (listener);
    philosophy.addActionListener (listener);
    carpentry.addActionListener (listener);
    
    add (quote);
    add (comedy);
    add (philosophy);
    add (carpentry);
    
    StyleListener listener2 = new StyleListener();
    bold.addItemListener (listener2);
    italic.addItemListener (listener2);
    
    add (bold);
    add (italic);
    
    add(controls);
    
    setBackground (Color.green);
    setPreferredSize (new Dimension(300, 200));
  }
  
  //*****************************************************************
  //  Represents the listener for all radio buttons
  //*****************************************************************
  private class QuoteListener implements ActionListener
  {
    //--------------------------------------------------------------
    //  Sets the text of the label depending on which radio
    //  button was pressed.
    //--------------------------------------------------------------
    public void actionPerformed (ActionEvent event)
    {
      Object source = event.getSource();
      
      if (source == comedy)
      { quote.setFont (new Font ("Helvetica", style, red));
        quote.setText (comedyQuote); }
      else
      {
        if (source == philosophy)
        { quote.setFont (new Font ("Helvetica", style, red));
          quote.setText (philosophyQuote);
        }
        else
        {quote.setFont (new Font ("Helvetica", style, red));
          quote.setText (carpentryQuote);
        }
      }
    }
  }
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener
  {
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style += Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      quote.setFont (new Font ("Helvetica", style, red));
    }
  }
  private class SliderListener implements ChangeListener
   {
      //--------------------------------------------------------------
      //  Gets the value of each slider, then updates the labels and
      //  the color panel.
      //--------------------------------------------------------------
      public void stateChanged(ChangeEvent event)
      {
         red = rSlider.getValue();
         rLabel.setText("Size: " + red);
         quote.setFont (new Font ("Helvetica", style, red));
      }
   }
}

