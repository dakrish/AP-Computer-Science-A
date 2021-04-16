import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class email 
{
  public static void main(String[] args)
  {
    class mailWindow extends JPanel 
    {
      public JTextField to, cc, bcc, subject, message;
      private JButton sendButton;
      public mailWindow()
      {
        JLabel toLabel = new JLabel ("To: ");
        JLabel ccLabel = new JLabel ("cc: ");
        JLabel bccLabel = new JLabel ("bcc: ");
        JLabel subjectLabel = new JLabel ("Subject: ");
        JLabel messageLabel = new JLabel ("Message: ");
        add(toLabel);
        to = new JTextField(30);
        cc = new JTextField(30);
        bcc = new JTextField(30);
        subject = new JTextField(30);
        message = new JTextField(30);
        
        add(to);
        add(ccLabel);
        add(cc);
        add(bccLabel);
        add(bcc);
        add(subjectLabel);
        add(subject);
        add(messageLabel);
        add(message);
        setBackground(Color.green);
        sendButton = new JButton("Send");
        sendButton.addActionListener(new SendListener());
        add(sendButton);
      }
      class SendListener implements ActionListener 
      {
        public void actionPerformed(ActionEvent evt) 
        {
          System.out.println("To: " + to.getText());
          System.out.println("Cc: " + cc.getText());
          System.out.println("Bcc: " + bcc.getText());
          System.out.println("Subject: " + subject.getText());
          System.out.println("Message: " + message.getText());
        }
      }
    }
    JFrame frame = new JFrame("Compose Message");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mailWindow email = new mailWindow(); 
    frame.getContentPane().add(email);
    frame.setSize(425, 400); 
    frame.setVisible(true); 
  } 
}