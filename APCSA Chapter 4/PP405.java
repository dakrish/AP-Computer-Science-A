import java.util.Scanner;
public class FlightTest
{
  public static void main(String[] args)
  {
    class Flight
    {
    int flightNum = 1;
    String airline = "i";
    String originCity = "i";
    String destCity = "i";
    String flightDescription = "i";
      public Flight(int flightNum, String airline, String originCity, String destCity, String flightDescription)
      {
    flightNum = flightNum;
    airline = airline;
    originCity = originCity;
    destCity = destCity;
    flightDescription = flightDescription;
      }
      public int getNum()
      {
        return flightNum;
      }
      public void newNum(int flightNum)
      {
        flightNum = flightNum;
      }
      public String getAirline()
      {
        return airline;
      }
      public String newAirline(String airline)
      {
        airline = airline;
      }
      public String getOrigin()
      {
        return originCity;
      }
      public void newOrigin(String originCity)
      {
        originCity = originCity;
      }
      public String getDest()
      {
        return destCity;
      }
      public void newDest(String destCity)
      {
        destCity = destCity;
      }
      public void getFlightDescription(String flightDescription)
      {
        flightDescription = flightDescription;
      }
      public String getDescription()
      {
        return flightDescription;
      }
    }
    
    Flight f1, f2;
    
    f1 = new flight(45, "American Airlines", "Paris, France", "Avon (CT), United States", "Fuel = 21%, Baguette Count = 34, requires restocking upon landing");
    f2 = new flight(27, "Frontier Airlines", "Wisconsin, United States", "Avon (CT), United States", "Fuel = 73%, Cheese Platter Count = 0, have doctors on standby to deal with victims of cheese starvation");
    
    System.out.println("Current Flights at KRC Airport:");
   
    System.out.println("Plane #1: " + f1.getNum + " " + f1.getAirline + " " + f1.getOriginCity + " " + f1.getdestCity + " " + f1.getFlightDescription);
    System.out.println("Plane #2: " + f2.getNum + " " + f2.getAirline + " " + f2.getOriginCity + " " + f2.getdestCity + " " + f2.getFlightDescription);
    
    f1.newNum(27);
    f1.newAirline("(no airline affiliated)");
    f1.newOrigin("Avon, CT");
    f1.newDest("Avon, CT");
    f1.newFlightDescription("Lent to a friend");
    
    f2.newNum(39);
    f2.newAirline("Frontier Airlines");
    f2.newOrigin("Chicago, IL");
    f2.newDest("Avon, CT");
    f2.newFlightDescription("Businessmen inbound. Restock on taxis and inform local hotels 30 minutes before arrival.");
    
    System.out.println("(1 day later) Current Flights at KRC Airport:");
   
    System.out.println("Plane #1: " + f1.getNum + " " + f1.getAirline + " " + f1.getOriginCity + " " + f1.getdestCity + " " + f1.getFlightDescription);
    System.out.println("Plane #2: " + f2.getNum + " " + f2.getAirline + " " + f2.getOriginCity + " " + f2.getdestCity + " " + f2.getFlightDescription);
    
   }
  }