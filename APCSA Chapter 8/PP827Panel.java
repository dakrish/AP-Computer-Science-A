//********************************************************************
// DirectionPanel.java Author: Lewis/Loftus
//
// Represents the primary display panel for the Direction program.
//********************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PP827Panel extends JPanel
{
  private final int WIDTH = 900, HEIGHT = 900; 
  private final int JUMP = 10; // increment for image movement
  private final int IMAGE_SIZE = 31;
  private ImageIcon up, down, right, left, currentImage;
  private int x, y;
//-----------------------------------------------------------------
// Constructor: Sets up this panel and loads the images.
//-----------------------------------------------------------------
  public PP827Panel()
  { 
    addKeyListener(new DirectionListener()); 
    x = WIDTH / 2;
    y = HEIGHT / 2;
    
    up = new ImageIcon("arrowUp.JPG");
    down = new ImageIcon("arrowDown.JPG");
    left = new ImageIcon("arrowLeft.JPG");
    right = new ImageIcon("arrowRight.JPG");
    
    currentImage = right;
    setBackground(Color.black);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setFocusable(true); 
  }
//-----------------------------------------------------------------
// Draws the image in the current location
//-----------------------------------------------------------------
  public void paintComponent(Graphics page) 
  {
    super.paintComponent(page);
    currentImage.paintIcon(this, page, x, y); 
  }
//*****************************************************************
// Represents the listener for keyboard activity.
//*****************************************************************
  private class DirectionListener implements KeyListener 
  {
//--------------------------------------------------------------
// Responds to the user pressing arrow keys by adjusting the
// image and image location accordingly.
//--------------------------------------------------------------
    public void keyPressed(KeyEvent event) 
    {
      switch (event.getKeyCode()) 
      {
        case KeyEvent.VK_UP:
          currentImage = up;
          if (( y -= JUMP) <= 0)
          {break;}
          else
          {
          y -= JUMP;
          break;
          }
        case KeyEvent.VK_DOWN:
          currentImage = down;
          if (( y += JUMP) >= 300)
          {break;}
          else
          {
          y += JUMP;
          break;
          }
        case KeyEvent.VK_LEFT:
          currentImage = left;
          if (( x -= JUMP) <= 0)
          {break;}
          else
          {
          x -= JUMP;
          break;
          }
        case KeyEvent.VK_RIGHT:
          currentImage = right;
          if (( x += JUMP) >= 300)
          {break;}
          else
          { x += JUMP;
          break;}  
      }
      repaint(); 
    }
//--------------------------------------------------------------
// Provide empty definitions for unused event methods.
//--------------------------------------------------------------
    public void keyTyped(KeyEvent event) {}
    public void keyReleased(KeyEvent event) {} 
  }
}