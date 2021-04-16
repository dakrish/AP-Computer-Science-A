//********************************************************************
//  FahrenheitPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PigPanel extends JPanel
{
   private JLabel inputLabel, outputLabel, resultLabel;
   private JTextField pig;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the main GUI components.
   //-----------------------------------------------------------------
   public PigPanel()
   {
      inputLabel = new JLabel ("Enter text:");
      outputLabel = new JLabel ("Text in Pig Latin: ");
      resultLabel = new JLabel ("---");

      pig = new JTextField (5);
      pig.addActionListener (new TextListener());

      add (inputLabel);
      add (pig);
      add (outputLabel);
      add (resultLabel);

      setPreferredSize (new Dimension(300, 75));
      setBackground (Color.yellow);
   }

   //*****************************************************************
   //  Represents an action listener for the temperature input field.
   //*****************************************************************
   private class TextListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Performs the conversion when the enter key is pressed in
      //  the text field.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         String text = pig.getText();
         resultLabel.setText(PigLatinTranslator.translate(text));
      }
   }
}
