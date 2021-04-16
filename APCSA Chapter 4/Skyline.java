import java.awt.*;
import java.util.*;
import java.applet.Applet;
public class Skyline extends Applet
{
  public void paint (Graphics page)
  {
    final int APPLET_WIDTH = 550;
    final int APPLET_HEIGHT = 200;
    final int MAX_GAP = 40;
    final int MIN_GAP = 5;
    Random gen = new Random();
    //----------------------------------------------------------------------------------------------
    //  Creates different building objects.
    //----------------------------------------------------------------------------------------------
    class Building
    {
      private final int SET_WIDTH = 50;
      private final int SET_HEIGHT = 100;
      private final int SET_WIND = 5;
      private final int MAX_WIND = 15;
      private final int WIND_SIZE = 5;
      private int width, height, windows;
      Random gen = new Random();
      //----------------------------------------------------------------------------------------------
      //  Constructor. Set values.
      //----------------------------------------------------------------------------------------------
      public Building ()
      {
        width = SET_WIDTH;
        height = SET_HEIGHT;
        windows = SET_WIND;
      }
      //----------------------------------------------------------------------------------------------
      //  Sets building size. Decides number of windows.
      //----------------------------------------------------------------------------------------------
      public Building (int bWidth, int bHeight)
      {
        width = bWidth;
        height = bHeight;;
        windows = (gen.nextInt() * MAX_WIND) + 1;
      }
      //----------------------------------------------------------------------------------------------
      //  Get width.
      //----------------------------------------------------------------------------------------------
      public int getWidth ()
      {
        return width;
      }
      //----------------------------------------------------------------------------------------------
      //  To draw building.
      //----------------------------------------------------------------------------------------------
      public void draw (Graphics page, int leftC, int bottom)
      {
        int top = bottom - height;
        page.setColor (Color.black);                 // building
        page.fillRect (leftC, top, width, height);
        page.setColor (Color.yellow);                 // windows
        for (int count = 1; count <= windows; count++)
        {
          int windX, windY;
          windX = leftC + (gen.nextInt() * (width - WIND_SIZE));
          windY = top + (gen.nextInt() * (height - WIND_SIZE));
          page.fillRect (windX, windY, WIND_SIZE, WIND_SIZE);            
        }
      }
    }
    Building b1 = new Building (55, 75);
    Building b2 = new Building (40, 170);
    Building b3 = new Building ();
    Building b4 = new Building (75, 135);
    Building b5 = new Building (30, 150);
    Building b6 = new Building ();
    Building b7 = new Building (25, 100);
    //----------------------------------------------------------------------------------------------
    //  Draws building with different gap distances.
    //----------------------------------------------------------------------------------------------
    setBackground (Color.cyan);
    setSize (APPLET_WIDTH, APPLET_HEIGHT);
    int gapVar, base, gap, leftC;
    gapVar = MAX_GAP - MIN_GAP;
    base = APPLET_HEIGHT - 10;
    gap = (gen.nextInt() * gapVar) + MIN_GAP;
    leftC = gap;
    page.drawLine (0, base, APPLET_WIDTH, base);
    b1.draw (page, leftC, base);
    gap = (int) (Math.random() * gapVar) + MIN_GAP;
    leftC += b1.getWidth() + gap;
    b2.draw (page, leftC, base);
    gap = (int) (Math.random() * gapVar) + MIN_GAP;
    leftC += b2.getWidth() + gap;
    b3.draw (page, leftC, base);
    gap = (int) (Math.random() * gapVar) + MIN_GAP;
    leftC += b3.getWidth() + gap;
    b4.draw (page, leftC, base);
    gap = (int) (Math.random() * gapVar) + MIN_GAP;
    leftC += b4.getWidth() + gap;
    b5.draw (page, leftC, base);
    gap = (int) (Math.random() * gapVar) + MIN_GAP;
    leftC += b5.getWidth() + gap;
    b6.draw (page, leftC, base);
    gap = (int) (Math.random() * gapVar) + MIN_GAP;
    leftC += b6.getWidth() + gap;
    b7.draw (page, leftC, base);
  }
}