import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class QuoteOptionsPanel extends JPanel
{
  public JLabel quote;
  public JRadioButton comedy, philosophy, carpentry, blank1, blank2;
  public String comedyQuote, philosophyQuote, carpentryQuote;
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and a set of radio buttons
  //  that control its text.
  //-----------------------------------------------------------------
  
  public QuoteOptionsPanel()
  {
    setLayout(new GridLayout(3, 2));
    
    comedyQuote = "Take my wife, please.";
    philosophyQuote = "I think, therefore I am.";
    carpentryQuote = "Measure twice. Cut once.";
    
    quote = new JLabel (comedyQuote);
    quote.setFont (new Font ("Helvetica", Font.BOLD, 24));
    quote.setVisible(false);
    
    comedy = new JRadioButton ("Comedy", true);
    comedy.setBackground (Color.green);
    philosophy = new JRadioButton ("Philosophy");
    philosophy.setBackground (Color.green);
    carpentry = new JRadioButton ("Carpentry");
    carpentry.setBackground (Color.green);
    blank1 = new JRadioButton ("", true);
    blank1.setBackground (Color.green);
    blank1.setVisible(false);
    blank2 = new JRadioButton ("", false);
    blank2.setBackground (Color.green);
    blank2.setVisible(false);
    
    ButtonGroup group = new ButtonGroup();
    group.add (comedy);
    group.add (philosophy);
    group.add (carpentry);
    
    QuoteListener listener = new QuoteListener();
    comedy.addActionListener (listener);
    philosophy.addActionListener (listener);
    carpentry.addActionListener (listener);
    
    add (comedy);
    add (quote);
    add (philosophy);
    add (blank1);
    add (carpentry);
    add (blank2);
    
    setBackground (Color.green);
    setPreferredSize (new Dimension(600, 100));
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
        quote.setText (comedyQuote);
      else
        if (source == philosophy)
        quote.setText (philosophyQuote);
      else
        quote.setText (carpentryQuote);
    }
  }
}