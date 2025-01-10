import java.util.*;
public class KilotoMileCon{
  public static void main (String[] args){
     
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the kilometer ");
     //create a variable kilometer that hold the value
     double km = sc.nextDouble();
   
   //create a variable conversionFactor that indicates
   //the 1km = 1.6miles
   double conversionFactor = 1.6;

  //create a miles that used to find out the km to miles
   double miles = km/conversionFactor;

   //print conversion of kilometer to miles
   System.out.print("The total miles is "+miles+" mile for the given "+ km+" km ");
     
     sc.close();

  }
}