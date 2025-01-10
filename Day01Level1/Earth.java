import java.util.*;
public class Earth{
  public static void main (String[] args){

          // create the variable radiuskm hold the value in km
        double radiusKm = 6378;

         //create a variable conversionfactor that indicates
        //the 1km = 1.6miles
        double conversionFactor = 1.6; 

        // Calculate the volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the volume to cubic miles
        double radiusMiles = radiusKm / conversionFactor;
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results
        System.out.print("The volume of Earth in cubic kilometers is "+volumeKm+" and cubic miles is "+volumeMiles);

  }
}