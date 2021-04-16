import javax.swing.JFrame;

public class PP821

{

//-----------------------------------------------------------------

// Creates and displays the application frame.

//-----------------------------------------------------------------

public static void main(String[] args)

{

JFrame frame = new JFrame("PP821");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.getContentPane().add(new PP821Panel());

frame.pack();

frame.setVisible(true);
}

}