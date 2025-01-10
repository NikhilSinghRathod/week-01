import java.util.*;

public class AreaofTriangle{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // used to enter the base from user
        System.out.print("Enter the Base in inches: ");
        double base = sc.nextDouble();

        // used to enter the Height from user
        System.out.print("Enter the Height in inches : ");
        double height = sc.nextDouble();
        
        //calculate the area of triange
        double area = 0.5*base*height;
       
       // // Conversion factor: 1 inch = 2.54 cm, so 1 square inch = 6.4516 square cm
        double conversionFactor = 6.4516;
        double areaInCm = area * conversionFactor;
  
      // print the result
       System.out.print("The area of the triangle is "+area+" square inches and "+areaInCm+" square centimeters");

      sc.close();
 }
}
