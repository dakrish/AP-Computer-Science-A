import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class PizzaPanel extends JPanel
{
  static JLabel sizeLabel, numberLabel;
  public static JLabel pizzaCostLabel;
  static JTextField pizzaSize, pizzaNumber;
  public static double pizzaCostDiameter = 0.00;
  public static double pizzaCostNumber = 0.00;
  public static double pizzaCostPizza = 0.00;
  
  public PizzaPanel()
  {
    sizeLabel = new JLabel ("Pizza Size (inches):");
    numberLabel = new JLabel ("Number of Pizzas: ");
    pizzaCostLabel = new JLabel ( " $ " + pizzaCostPizza);
    
    pizzaSize = new JTextField (5);
    pizzaSize.setText("0");
    pizzaSize.addActionListener (new pizzaListener());
    
    pizzaNumber = new JTextField (5);
    pizzaNumber.setText("0");
    pizzaNumber.addActionListener (new pizzaListener());
    
    add (sizeLabel);
    add (pizzaSize);
    add (numberLabel);
    add (pizzaNumber);
    
    JButton push = new JButton ("Calculate Cost");
    push.addActionListener (new ButtonListener());
    
    add (push);
    
    add (pizzaCostLabel);
    setPreferredSize (new Dimension(280, 100));
    setBackground (Color.cyan);
    this.setBorder(BorderFactory.createLineBorder(Color.black, 3));
  }
  private class pizzaListener implements ActionListener
  {
    public void actionPerformed (ActionEvent event)
    {
      pizzaCostDiameter = (Double.parseDouble(pizzaSize.getText()))-4;
      pizzaCostNumber = Double.parseDouble(pizzaNumber.getText());
      pizzaCostLabel.setText("$ " + (FriesPanel.friesCostDiameter * FriesPanel.friesCostNumber + SodaPanel.sodaCostDiameter * SodaPanel.sodaCostNumber + pizzaCostDiameter * pizzaCostNumber));
    }
  }
  private class ButtonListener implements ActionListener
  {
    public void actionPerformed (ActionEvent event)
    {
      pizzaCostDiameter = (Double.parseDouble(pizzaSize.getText()))-4;
      pizzaCostNumber = Double.parseDouble(pizzaNumber.getText());
      pizzaCostLabel.setText("$ " + (FriesPanel.friesCostDiameter * FriesPanel.friesCostNumber + SodaPanel.sodaCostDiameter * SodaPanel.sodaCostNumber + pizzaCostDiameter * pizzaCostNumber));
    }
  }
}