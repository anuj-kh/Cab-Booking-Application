import java.sql.*;
import java.lang.Math;

public class Booking
{
    private Cab D=new Cab();
    private Customer C=new Customer();
    public Location pickup=new Location();public Location destination=new Location();
    private double distance, tripFare,time,unitFare,speed;
    private CustomerDatabase cdb=new CustomerDatabase();
    private DriverDatabase ddb=new DriverDatabase();
    public Booking() {}
    public Booking(Customer C,Location pickup,Location destination,CustomerDatabase cdb,DriverDatabase ddb)
    {
        this.C=C;
        this.pickup=pickup;
        this.destination=destination;
        unitFare=10.0;
        speed=10.0;
        distance=pickup.distance(destination);
        tripFare=unitFare*distance;
        time=distance/speed;
        time*=500;   
        this.cdb=cdb;
        this.ddb=ddb;
        D=new Cab();
    }
    public Cab getdriver()
    {
            return D;
    }
    public boolean availableCab()       /*Checks if any Driver is available returns true if available and false if not */
    {
        return ddb.availableCab();
    }
    public boolean checkMoney()   /*Checks if customer has enough money returns true if he has money false if not */
    {
        if(C.checkTotal(tripFare)) return true;
        else return false;
    }
    public void findCab()
    {
        ddb.findCab(pickup,D);
    }
    public void endTrip(double rating)     /* Ends the Trip */
    {
        ddb.updateDriver(destination, rating, D);
        cdb.updatewallet(-1*tripFare, C);
        /* Customer will rate the driver.
        Driver rating will be updated. Driver status will be changed to available in database
        Driver new location will be destination
        */
    }
    public double getfare()
    {
        return tripFare;
    }
    public double gettime()
    {
        return time;
    }
}
