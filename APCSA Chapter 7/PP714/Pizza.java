import javax.swing.*;
import javax.swing.border.*;
public class Pizza
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Layout Manager Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTabbedPane tp = new JTabbedPane();
    tp.addTab("Pizza", new PizzaPanel());
    tp.addTab("Soda", new SodaPanel());
    tp.addTab("Fries", new FriesPanel());
    frame.getContentPane().add(tp);
    frame.pack();
    frame.setVisible(true);
  }
}