public class FlightTest
{
  public static void main(String[] args)
  {
    class flight
    {
    int flightNum = 1;
    String airline = "i";
    String originCity = "i";
    String destCity = "i";
    String flightDescription = "i";
      public flight(int flightNum1, String airline1, String originCity1, String destCity1, String flightDescription1)
      {
    flightNum = flightNum1;
    airline = airline1;
    originCity = originCity1;
    destCity = destCity1;
    flightDescription = flightDescription1;
      }
      public int getNum()
      {
        return flightNum;
      }
      public void newNum(int flightNum1)
      {
        flightNum = flightNum1;
      }
      public String getAirline()
      {
        return airline;
      }
      public void newAirline(String airline1)
      {
        airline = airline1;
      }
      public String getOrigin()
      {
        return originCity;
      }
      public void newOrigin(String originCity1)
      {
        originCity = originCity1;
      }
      public String getDest()
      {
        return destCity;
      }
      public void newDest(String destCity1)
      {
        destCity = destCity1;
      }
      public void newFlightDescription(String flightDescription1)
      {
        flightDescription = flightDescription1;
      }
      public String getFlightDescription()
      {
        return flightDescription;
      }
    }
    
    flight f1, f2;
    
    f1 = new flight(45, "American Airlines", "Paris, France", "Avon (CT), United States", "Fuel = 21%, Baguette Count = 34, requires restocking upon landing.");
    f2 = new flight(27, "Frontier Airlines", "Wisconsin, United States", "Avon (CT), United States", "Fuel = 73%, Cheese Platter Count = 0, have doctors on standby to deal with victims of cheese starvation.");
    
    System.out.println("Current Flights at KRC Airport:");
   
    System.out.println("Plane #1: Flight# " + f1.getNum() + " of " + f1.getAirline() + ", coming from " + f1.getOrigin() + ", and arriving at " + f1.getDest() + ". Notes: " + f1.getFlightDescription());
    System.out.println("Plane #2: Flight# " + f2.getNum() + " of " + f2.getAirline() + ", coming from " + f2.getOrigin() + " and arriving at " + f2.getDest() + ". Notes: " + f2.getFlightDescription());
    
    f1.newNum(27);
    f1.newAirline("(no airline affiliated)");
    f1.newOrigin("Avon, CT");
    f1.newDest("Avon, CT");
    f1.newFlightDescription("Lent to a friend.");
    
    f2.newNum(39);
    f2.newAirline("Frontier Airlines");
    f2.newOrigin("Chicago, IL");
    f2.newDest("Avon, CT");
    f2.newFlightDescription("Businessmen inbound. Restock on taxis and inform local hotels 30 minutes before arrival.");
    
    System.out.println("(1 day later) Current Flights at KRC Airport:");
   
    System.out.println("Plane #1: Flight# " + f1.getNum() + " of " + f1.getAirline() + ", coming from " + f1.getOrigin() + " and arriving at " + f1.getDest() + ". Notes: " + f1.getFlightDescription());
    System.out.println("Plane #2: Flight# " + f2.getNum() + " of " + f2.getAirline() + ", coming from " + f2.getOrigin() + " and arriving at " + f2.getDest() + ". Notes: " + f2.getFlightDescription());
    
   }
  }