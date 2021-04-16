import javax.swing.JFrame;

public class PP819

{

//-----------------------------------------------------------------

// WARNING: This applet ONLY WORKS AS INTENDED WHEN lines are drawn by CLICKING, HOLDING TO THE NEXT POINT, AND THEN RELEASING.
//          IN ADDITION, it does not work for the few few lines properly. EVERY LINE AFTER THE FIRST FEW will have a delay when 
//          being drawn (i.e. they are only drawn when the line following it is drawn.

//-----------------------------------------------------------------

public static void main(String[] args)

{

JFrame frame = new JFrame("PP821");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.getContentPane().add(new PP819Panel());

frame.pack();

frame.setVisible(true);
}

}