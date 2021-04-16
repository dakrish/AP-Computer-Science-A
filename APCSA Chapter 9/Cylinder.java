public class Cylinder extends Solid
{
  public Cylinder (double rad, double h)
  {
    surfaceArea = 2*Math.PI*rad+Math.PI*rad*h;
    height = h;
    radius = rad;
    baseArea = Math.PI*rad*rad;
    name = "cylinder";
  }
}