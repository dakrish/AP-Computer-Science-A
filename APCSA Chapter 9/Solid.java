public class Solid
{
  //Cube, RectPrism, Cylinder
  protected double surfaceArea = 0.00;
  protected double height = 0.00;
  protected double radius = 0.00;
  protected double baseArea = 0.00;
  protected double volume = 0.00;
  protected String name = "thing";
  
  public Solid(){}
  public double BAHVolume()
  {
    volume = (this.getBaseArea()*this.getHeight());
    return volume;
  }
  
  public double getBaseArea()
  {
    return this.baseArea;
  }
  
  public double getHeight()
  {
    return this.height;
  }
  
  public String toString()
  {
    return "This 3D solid is a " + name + " with a surface area of " + surfaceArea + " and a volume of " + this.BAHVolume();
  }
}