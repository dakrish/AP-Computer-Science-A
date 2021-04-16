import javax.swing.*;
public class LayoutDemo
{
  public static void main (String[] args)
  {
    JFrame frame = new JFrame ("Layout Manager Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTabbedPane tp = new JTabbedPane();
    tp.addTab ("Intro", new IntroPanel());
    frame.getContentPane().add(tp);
    frame.pack();
    frame.setVisible(true);
  }
}