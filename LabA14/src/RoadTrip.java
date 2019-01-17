import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Prabhdeep Kainth
 * period #4
 *
 */
public class RoadTrip
{
    //list of geo locations
    //your code goes here
		private ArrayList <GeoLocation> geo = new ArrayList <GeoLocation> ();
    private GeoLocation geo1;
    private int stops = 0;
    private double tripLength = 0.0;
    
    /**
     * Constructor reads in the geo locations from the given file and adds them to 
     * the list
     * @param fname - file name
     */
    public RoadTrip(String fname)
    {
    	//your code goes here
    	try {
    		Scanner in = new Scanner(new File(fname));
    		
    		while(in.hasNext()) {
    			String name = in.next();
    			double lati = in.nextDouble();
    			double longi = in.nextDouble();
    			addStop(name, lati, longi);
    			stops++;
    		} 
    	} catch (IOException e){
  			System.out.println(e.getMessage());
  		}
    }
    
    
    /**
     * Create a GeoLocation and add it to the road trip
     * @param name - name of the geo location
     * @param latitude - latitude in degrees
     * @param longitude - longitude in degrees
     */
   
    public void addStop(String name, double latitude, double longitude)
    {
        //your code goes here
    	geo1 = new GeoLocation(name, latitude, longitude);
			geo.add(geo1);

    }

    /**
     * Get the total number of stops in the trip
     * @return total number of stops
     */
    public int getNumberOfStops()
    {
        //your code goes here
    	return stops;
    }

    /**
     * Get the total miles of the trip
     * @return the total miles
     */
    
    public double getTripLength()
    {
        //your code goes here
    	tripLength = 0.0;
    	for(int i = 0; i < (geo.size() - 1); i++) {
    		GeoLocation start = geo.get(i);
    		GeoLocation end = geo.get(i + 1);
    		
    		tripLength += (start.distanceFrom(end));
    		
    	}
    	
    	return tripLength;
    }

    /**
     * Return a formatted toString of the trip
     * @return information about the trip
     */
     
    public String toString()
    {
        //your code goes here
    	String toString = "";
    	for(int i = 0; i < geo.size(); i++) {
    		toString += geo.get(i).toString();
    	}
    	
    	toString += ("Stops: " + this.getNumberOfStops() + "\nTotal miles: " + this.getTripLength() + " miles\n");
    	
    	return toString;
    	
    }
}