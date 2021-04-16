import javax.swing.JFrame;

public class PigGUI
{
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("PigGUI");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      PigPanel panel = new PigPanel();

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}