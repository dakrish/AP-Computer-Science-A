public class BusCommuter extends PayCommuter
{
    private double MONTHLY_RATE;
    private boolean busPass;
    public BusCommuter (String name, double fare, double rate)
    {
     super(name, fare);
        MONTHLY_RATE = rate;
        busPass = false;
    }
    public void buyBussPass (double fare)
    {
     busPass = (fare > MONTHLY_RATE);
    }
    public void addMiles(int miles)
    {
     if ((super.getPaid() == true) || (busPass))
        {
         super.addMiles(miles);
        }
    }
    public String toString() 
    {
      return (super.toString() + "- Monthly pass: $" + MONTHLY_RATE);
    }
}