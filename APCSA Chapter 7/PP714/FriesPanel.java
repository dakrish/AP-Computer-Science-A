import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class FriesPanel extends JPanel
{
  static JLabel sizeLabel, numberLabel;
  public static JLabel friesCostLabel;
  static JTextField friesSize, friesNumber;
  public static double friesCostDiameter = 0.00;
  public static double friesCostNumber = 0.00;
  public static double friesCostFries = 0.00;
  
  public FriesPanel()
  {
    sizeLabel = new JLabel ("Fries Amount:     ");
    numberLabel = new JLabel ("Number of Packs:     ");
    friesCostLabel = new JLabel ( " $ " + friesCostFries);
    
    friesSize = new JTextField (5);
    friesSize.setText("0");
    friesSize.addActionListener (new friesListener());
    
    friesNumber = new JTextField (5);
    friesNumber.setText("0");
    friesNumber.addActionListener (new friesListener());
    
    add (sizeLabel);
    add (friesSize);
    add (numberLabel);
    add (friesNumber);
    
    JButton push = new JButton ("Calculate Cost");
    push.addActionListener (new ButtonListener());
    
    add (push);
    
    add (friesCostLabel);
    setPreferredSize (new Dimension(280, 100));
    setBackground (Color.cyan);
    this.setBorder(BorderFactory.createLineBorder(Color.magenta, 3));
  }
  private class friesListener implements ActionListener
  {
    public void actionPerformed (ActionEvent event)
    {
      friesCostDiameter = (Double.parseDouble(friesSize.getText()))*0.1;
      friesCostNumber = Double.parseDouble(friesNumber.getText());
      friesCostLabel.setText("$ " + (friesCostDiameter * friesCostNumber + SodaPanel.sodaCostDiameter * SodaPanel.sodaCostNumber + PizzaPanel.pizzaCostDiameter * PizzaPanel.pizzaCostNumber));
    }
  }
  private class ButtonListener implements ActionListener
  {
    public void actionPerformed (ActionEvent event)
    {
      friesCostDiameter = (Double.parseDouble(friesSize.getText()))*0.1;
      friesCostNumber = Double.parseDouble(friesNumber.getText());
      friesCostLabel.setText("$ " + (friesCostDiameter * friesCostNumber + SodaPanel.sodaCostDiameter * SodaPanel.sodaCostNumber + PizzaPanel.pizzaCostDiameter * PizzaPanel.pizzaCostNumber));
    }
  }
}