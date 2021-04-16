public class Cube extends Solid
{
  public Cube (double side)
  {
    surfaceArea = 6*side*side;
    height = side;
    radius = 0.00;
    baseArea = side*side;
    name = "cube";
  }
}