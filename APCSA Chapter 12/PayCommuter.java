public class PayCommuter extends Commuter
{
 private boolean paid;
 private double FARE;
 public PayCommuter(String name, double fare)
    {
     super(name);
     FARE = fare;
     paid = false;
    }
    public boolean getPaid()
    {
     return paid;
    }
    public double getFare()
    {
     return FARE;
    }
    public void payFare(double moneyPaid)
    {
     paid = (moneyPaid > FARE);
    }
    public void addMiles(int miles) 
    {
        if (paid)
        {
         super.addMiles(miles);
            paid = false;
        }
    } 
    public String toString() 
    {
  return (super.toString() + "- Single ride: $" + FARE);
 }
}