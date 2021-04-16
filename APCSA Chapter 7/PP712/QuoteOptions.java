import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class QuoteOptions
{
  //-----------------------------------------------------------------
  //  Creates and presents the program frame.
  //-----------------------------------------------------------------
  public static void main (String[] args)
  {
    JFrame quoteFrame = new JFrame ("Quote Options");
    quoteFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    QuoteOptionsPanel gui = new QuoteOptionsPanel();
    
    
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
    JPanel panel1 = new QuotePanel();
    gui.setBorder(BorderFactory.createLineBorder(Color.red, 10));
    
    mainPanel.add(gui);
    mainPanel.add(panel1);
    quoteFrame.getContentPane().add(mainPanel);
    quoteFrame.pack();
    quoteFrame.show();
  }
}