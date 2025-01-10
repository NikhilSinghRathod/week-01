import java.util.*;

public class SquareSideCal{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // used to enter the perimeter numbers from user
        System.out.print("Enter the perimeter: ");
        double perimeter = sc.nextDouble();
       
       // calculate the side of the square
       double side = perimeter/4;
  
      // print the result
       System.out.print(" The length of the side is "+side+" whose perimeter is "+perimeter);

      sc.close();
 }
}
