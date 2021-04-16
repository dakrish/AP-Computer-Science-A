import java.util.Random;
import java.awt.*;
import javax.swing.*;
// Draws a square-tired SUV drifting through space
public class PP911
{
public static void main(String[] args)
{
JFrame frame = new JFrame("Line");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new LinePanel());
frame.pack();
frame.setVisible(true);
}
}