import java.util.*;
public class KilotoMile{
  public static void main (String[] args){

   //create a variable kilometer that hold the value
   double kilometer = 10.8;
   
   //create a variable conversionfactor that indicates
   //the 1km = 1.6miles
   double conversionFactor = 1.6;

  //create a miles that used to find out the km to miles
   double miles = kilometer/conversionFactor;

   //print conversion of kilometer to miles
   System.out.print("The distance "+ kilometer +" km in miles is "+miles);


  }
}