import java.util.*;
public class DistanceCalculator{
  public static void main (String[] args){
     
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Feet ");
     //create a variable distance in feet that hold the value
     double distanceInFeet = sc.nextDouble();
   
     double feetPerYard = 3.0;
     double yardsPerMile = 1760.0;

      // Convert to yards and miles
      double distanceInYards = distanceInFeet / feetPerYard;
       double distanceInMiles = distanceInYards / yardsPerMile;

     //print conversion of feet to miles and yards
     System.out.print("Your Distance in feet is "+ distanceInFeet+" while in miles is "+ distanceInMiles +" and Yards is "+distanceInYards);
     
     sc.close();

  }
}