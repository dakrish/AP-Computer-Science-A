public class Car
{
 private String make;
 private String model;
 private int year;
 public Car(String make,String model,int year)
 {
  this.make = make;
  this.model= model;
  this.year = year;
 }
 
 public String setCarMake(String make)
 {
  this.make = make;
  return make;
 }
 
 public String getCarMake()
 {
  return make;
 }
 
 public String setCarModel(String model)
 {
  this.model = model;
  return model;
 }
 
 public String getCarModel()
 {
  return model;
 }
 
 public int setCarYear(int year)
 {
  this.year = year;
  return year;
 }
 
 public int getCarYear()
 {
  return year;
 }
 
 public String toString()
 {
  return "Car make: " + make + "      
  Car model: " + model + "      Car Year:" + year;
 }
 
 public static void main (String[] args)
 {
  Car car1 = new Car("Toyota", "Corolla" , 1996);
  Car car2 = new Car("Nissan", "Murano" , 2004);
  Car car3 = new Car("Infinity", "Mazda" , 2013);
  
  car1.setCarMake("BMW");
  System.out.println(car1);
  System.out.println(car1.getCarYear());

  car2.setCarModel("Altima");
  System.out.println(car2);
  System.out.println(car2.getCarMake());
  
  car3.setCarYear(2012);
  System.out.println(car3);
  System.out.println(car3.getCarModel());


 }
}