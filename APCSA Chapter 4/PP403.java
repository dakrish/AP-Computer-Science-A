import java.util.Scanner;
public class MultiSphere
{
  public static void main(String[] args)
  {
    class Sphere
    {
      public double diameter;
      public double surfaceArea;
      public double volume;
      public void Sphere()
      {
        diameter = 1;
      }
      public double getVolume(double diameter)
      {
        return ((4/3)*Math.PI*(Math.pow((diameter/2), 3)));
      }
      public void getDiameter(double diameter)
      {
        diameter = diameter;
      }
      public double getSurfaceArea(double diameter)
      {
        return (4*Math.PI*(Math.pow((diameter/2),2)));
      }
      public void reset()
      {
        diameter = 0;
      }
    }
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Preset Diameters: sphere 1 = 1, sphere 2 = 2, sphere 3 = 3");
    System.out.println("Input new diameters now. Else, type in the above");
    
    double diameter1 = scan.nextDouble();
    double diameter2 = scan.nextDouble();
    double diameter3 = scan.nextDouble();
    
    Sphere sphere1, sphere2, sphere3;
    
    sphere1 = new Sphere();
    sphere2 = new Sphere();
    sphere3 = new Sphere();
    
    System.out.print(" Sphere 1 surface area: " + sphere1.getSurfaceArea(diameter1));
    System.out.print(" Sphere 2 surface area: " + sphere2.getSurfaceArea(diameter2));
    System.out.println(" Sphere 3 surface area: " + sphere3.getSurfaceArea(diameter3));
    
    System.out.print(" Sphere 1 volume: " + sphere1.getVolume(diameter1));
    System.out.print(" Sphere 2 volume: " + sphere2.getVolume(diameter2));
    System.out.print(" Sphere 3 volume: " + sphere3.getVolume(diameter3));
    
  }
}