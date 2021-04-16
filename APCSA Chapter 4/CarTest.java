public class CarTest{
  public static void main (String[] args)
  {
    class Car
    {
      private String make;
      private String model;
      private int year;
      private int currentYear;
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
        return "Car make: " + make + "Car model: " + model + "Car Year:" + year;
      }
      public Boolean isAntique(int year)
      {
        if (year <= (currentYear - 45))
        {
          return true;
        }
        else
        {
          return false;
        }
      }
    }
    
    Car car1 = new Car("Toyota ", "Corolla " , 1996);
    Car car2 = new Car("Nissan ", "Murano " , 2004);
    Car car3 = new Car("Infinity ", "Mazda " , 2013);
    
    car1.setCarMake("BMW ");
    System.out.println(car1);
    System.out.println(car1.getCarYear());
    System.out.println("This car is an antique? " + car1.isAntique(car1.getCarYear()));
    
    car2.setCarModel("Altima ");
    System.out.println(car2);
    System.out.println(car2.getCarMake());
    System.out.println("This car is an antique? " + car2.isAntique(car2.getCarYear()));
    
    car3.setCarYear(2012);
    System.out.println(car3);
    System.out.println(car3.getCarModel());
    System.out.println("This car is an antique? " + car3.isAntique(car3.getCarYear()));
    
    
    
  }
}