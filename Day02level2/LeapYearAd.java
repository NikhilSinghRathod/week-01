import java.util.Scanner;

public class LeapYearAd {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt(); // Read the year input

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The LeapYear program only works for years >= 1582.");
        } 
           else{
            // Approach 2: Using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println( year + " is a Leap Year.");
            } else {
                System.out.println( year + " is not a Leap Year.");
            }
        }

        // Close the scanner to free resources
        sc.close();
    }
}
