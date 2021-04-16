import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class EmailWindow
{
  public static void main(String[] args)
  {
    class EmailPanel extends JPanel
    {
      public JTextField toField, ccField, bccField, subjectField, messageField;
      private JButton push;
      public EmailPanel()
      {
        JLabel toLabel = new JLabel ("To: ");
        JLabel ccLabel = new JLabel ("cc: ");
        JLabel bccLabel = new JLabel ("bcc: ");
        JLabel subjectLabel = new JLabel ("Subject: ");
        JLabel messageLabel = new JLabel ("Message: ");
        
        toField = new JTextField (30);
        ccField = new JTextField (30);
        bccField = new JTextField (30);
        subjectField = new JTextField (30);
        messageField = new JTextField (30);
        
        add (toLabel);
        add (toField);
        add (ccLabel);
        add (ccField);
        add (bccLabel);
        add (bccField);
        add (subjectLabel);
        add (subjectField);
        add (messageLabel);
        add (messageField);
        
        push = new JButton ("Send");
        push.addActionListener(new ButtonListener());
        
        add(push);
        
        setPreferredSize (new Dimension(500, 500));
        setBackground (Color.pink);
      }
      class ButtonListener implements ActionListener
      {
        public void actionPerformed(ActionEvent evt)
        {
          System.out.println("To: " + toField.getText());
          System.out.println("Cc: " + ccField.getText());
          System.out.println("Bcc: " + bccField.getText());
          System.out.println("Subject: " + subjectField.getText());
          System.out.println("Message: " + messageField.getText());
        }
      }
    }
    JFrame frame = new JFrame("Email");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    EmailPanel email = new EmailPanel(); 
    frame.getContentPane().add(email);
    frame.setSize(400, 250); 
    frame.setVisible(true); 
  }
}