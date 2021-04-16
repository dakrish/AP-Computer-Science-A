//********************************************************************
//  TiledPictures.java       Author: Lewis/Loftus
//
//  Demonstrates the use of recursion.
//********************************************************************
 
import java.applet.Applet;
import java.awt.*;
 
public class PP1205 extends Applet
{
   private final int APPLET_WIDTH = 320;
   private final int APPLET_HEIGHT = 320;
   private final int MIN = 1;  // smallest picture size
 
   private Image world, everest, goat;
 
   //-----------------------------------------------------------------
   //  Loads the images.
   //-----------------------------------------------------------------
   public void init()
   {
      world = getImage (getDocumentBase(), "world.gif");
      everest = getImage (getDocumentBase(), "everest.gif");
      goat = getImage (getDocumentBase(), "goat.gif");
 
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }
 
   //-----------------------------------------------------------------
   //  Draws the three images, then calls itself recursively.
   //-----------------------------------------------------------------
   public void drawPictures (int x, int y, int size, Graphics page)
   {
      page.drawImage (everest, x, y + size/2, size/2, size/2, this);
      page.drawImage (goat, x + size/2, y, size/2, size/2, this);
      page.drawImage (world, x, y, size/2, size/2, this);
 
      if (size > MIN)
      {
         drawPictures (x + size/2, y + size/2, size/2, page);
      }
   }
 
   //-----------------------------------------------------------------
   //  Performs the initial call to the drawPictures method.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      drawPictures (0, 0, APPLET_WIDTH, page);
   }
}