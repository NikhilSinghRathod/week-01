import java.util.Scanner;

public class RoundsInTrianglePark {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the three sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle (sum of all sides)
        double perimeter = side1 + side2 + side3;

        // Convert the total distance to run (5 km) into meters (5000 meters)
        double totalDistanceInMeters = 5000;

        // Calculate the number of rounds by dividing total distance by perimeter
        double rounds = totalDistanceInMeters / perimeter;

        // Print the result
        System.out.print("The total number of rounds the athlete will run is "+ rounds +"to complete 5 km ");

        // Close the scanner
        scanner.close();
    }
}
