import java.util.*;
public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc= new Scanner(System.in);

        // Create a variable height the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Conversion factors of cm to inch
        double cmPerInch = 2.54;
       
        //Conversion factors of inches to foot
        int inchesPerFoot = 12;

        // Convert height to inches
        double totalInches = heightCm / cmPerInch;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        // Print the results
        System.out.printf("Your Height in cm is "+heightCm+ " while in feet is "+feet+ " and inches is " + inches);

        // Close the scanner
        sc.close();
    }
}