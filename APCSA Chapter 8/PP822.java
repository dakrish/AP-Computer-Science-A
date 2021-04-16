import javax.swing.JFrame;

public class PP822

{

//-----------------------------------------------------------------

// Creates and displays the application frame.

//-----------------------------------------------------------------

public static void main(String[] args)

{

JFrame frame = new JFrame("Rubber Circles");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.getContentPane().add(new PP822Panel());

frame.pack();

frame.setVisible(true);

}

}