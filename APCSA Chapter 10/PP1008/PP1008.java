import javax.swing.JFrame;

public class PP1008
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //  WARNING: CHANGE FONT SIZE BEFORE YOU DO ANYTHING ELSE !!!
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Quote Options");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      ComboPanel panel = new ComboPanel();
      frame.getContentPane().add (panel);

      frame.pack();
      frame.setVisible(true);
   }
}
