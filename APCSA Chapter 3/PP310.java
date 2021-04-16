import java.awt.*;
import javax.swing.*;

public class PP310
{ 
  public static void main (String[] args)
  { 
    JFrame frame = new JFrame();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel primary = new JPanel();
    
    primary.setPreferredSize(new Dimension(100,150));
    
    JLabel label1=new JLabel("Krishna");
    JLabel label2=new JLabel("Cheemalapati");
      
    primary.add(label1);
    primary.add(label2);
    
    frame.getContentPane().add(primary);
    
    frame.pack();
    
    frame.setVisible(true);
  }
}