//********************************************************************
// QuoteOptionsPanel.java Author: Lewis/Loftus/Cheemalapati
//
// Demonstrates the use of radio buttons and arrays.
//********************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QuoteOptionsPanel extends JPanel
{
  private JLabel quote;
  private JRadioButton comedy, philosophy, carpentry, dumbPatrick, smartPatrick, spongebob;
  private String[] QuotesArray = {"Take my wife, please.", "I think, therefore I am.", "Measure twice, cut once.", "Well, it may be stupid, but it’s also dumb.", "The inner machinations of my mind are an enigma.", "Isn’t this great Squidward? It’s just the 3 of us. You, me, and this brick wall you built between us"};
  public QuoteOptionsPanel() 
  {
    quote = new JLabel(QuotesArray[1]);
    quote.setFont(new Font("Helvetica", Font.BOLD, 24));
    
    comedy = new JRadioButton("Comedy", true);
    comedy.setBackground(Color.green);
    
    philosophy = new JRadioButton("Philosophy"); 
    philosophy.setBackground(Color.green);
   
    carpentry = new JRadioButton("Carpentry");
    carpentry.setBackground(Color.green);
    
    dumbPatrick = new JRadioButton("(Dumb) Patrick Star");
    dumbPatrick.setBackground(Color.green);
    
    smartPatrick = new JRadioButton("(Smart) Patrick Star");
    smartPatrick.setBackground(Color.green);
    
    spongebob = new JRadioButton("Spongebob");
    spongebob.setBackground(Color.green);
    
    ButtonGroup group = new ButtonGroup();
    group.add(comedy);
    group.add(philosophy);
    group.add(carpentry);
    group.add(dumbPatrick);
    group.add(smartPatrick);
    group.add(spongebob);
    
    QuoteListener listener = new QuoteListener();
    
    comedy.addActionListener(listener);
    philosophy.addActionListener(listener);
    carpentry.addActionListener(listener);
    smartPatrick.addActionListener(listener);
    dumbPatrick.addActionListener(listener);
    spongebob.addActionListener(listener);
    
    add(quote);
    add(comedy);
    add(philosophy);
    add(carpentry);
    add(dumbPatrick);
    add(smartPatrick);
    add(spongebob);
    
    setBackground(Color.green);
    setPreferredSize(new Dimension(300, 100)); 
  }
  private class QuoteListener implements ActionListener 
  {
    public void actionPerformed(ActionEvent event) 
    {
      Object source = event.getSource();
      if (source == comedy)
        quote.setText(QuotesArray[0]);
      if (source == philosophy)
        quote.setText(QuotesArray[1]);
      if (source == carpentry)
        quote.setText(QuotesArray[2]); 
      if (source == dumbPatrick)
        quote.setText(QuotesArray[3]);
      if (source == smartPatrick)
        quote.setText(QuotesArray[4]);
      if (source == spongebob)
        quote.setText(QuotesArray[5]);
    } 
  } 
}