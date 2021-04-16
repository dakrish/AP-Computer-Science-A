import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class SodaPanel extends JPanel
{
  static JLabel sizeLabel, numberLabel;
  public static JLabel sodaCostLabel;
  static JTextField sodaSize, sodaNumber;
  public static double sodaCostDiameter = 0.00;
  public static double sodaCostNumber = 0.00;
  public static double sodaCostSoda = 0.00;
  
  public SodaPanel()
  {
    sizeLabel = new JLabel ("Soda Height (inches):");
    numberLabel = new JLabel ("Number of Sodas: ");
    sodaCostLabel = new JLabel ( " $ " + sodaCostSoda);
    
    sodaSize = new JTextField (5);
    sodaSize.setText("0");
    sodaSize.addActionListener (new sodaListener());
    
    sodaNumber = new JTextField (5);
    sodaNumber.setText("0");
    sodaNumber.addActionListener (new sodaListener());
    
    add (sizeLabel);
    add (sodaSize);
    add (numberLabel);
    add (sodaNumber);
    
    JButton push = new JButton ("Calculate Cost");
    push.addActionListener (new ButtonListener());
    
    add (push);
    
    add (sodaCostLabel);
    setPreferredSize (new Dimension(280, 100));
    setBackground (Color.cyan);
    this.setBorder(BorderFactory.createLineBorder(Color.red, 3));
  }
  private class sodaListener implements ActionListener
  {
    public void actionPerformed (ActionEvent event)
    {
      sodaCostDiameter = (Double.parseDouble(sodaSize.getText()))/4;
      sodaCostNumber = Double.parseDouble(sodaNumber.getText());
      sodaCostLabel.setText("$ " + (sodaCostDiameter * sodaCostNumber + FriesPanel.friesCostDiameter * FriesPanel.friesCostNumber + PizzaPanel.pizzaCostDiameter * PizzaPanel.pizzaCostNumber));
    }
  }
  private class ButtonListener implements ActionListener
  {
    public void actionPerformed (ActionEvent event)
    {
      sodaCostDiameter = (Double.parseDouble(sodaSize.getText()))/4;
      sodaCostNumber = Double.parseDouble(sodaNumber.getText());
      sodaCostLabel.setText("$ " + (sodaCostDiameter * sodaCostNumber + FriesPanel.friesCostDiameter * FriesPanel.friesCostNumber + PizzaPanel.pizzaCostDiameter * PizzaPanel.pizzaCostNumber));
    }
  }
}