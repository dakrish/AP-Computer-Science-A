import java.util.Random;
import java.awt.*;
import javax.swing.*;
// Draws a square-tired SUV drifting through space
public class PP912
{
public static void main(String[] args)
{
JFrame frame = new JFrame("Catch-The-Creature");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new PP912Panel());
frame.pack();
frame.setVisible(true);
}
}