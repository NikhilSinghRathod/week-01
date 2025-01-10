import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of the traveler
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //  the user to enter the cities for the trip
        System.out.print("Enter the name of the city you are traveling from: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the name of the city you are traveling via: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the name of the final destination city: ");
        String toCity = scanner.nextLine();

        //  the user to enter the distances in miles between the cities
        System.out.print("Enter the distance in miles from " + fromCity + " to " + viaCity + ": ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance in miles from " + viaCity + " to " + toCity + ": ");
        double viaToFinalCity = scanner.nextDouble();

        // Prompt the user to enter the time taken for the journey in hours
        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = scanner.nextDouble();

        // Compute the total distance traveled by adding the two segments
        double totalDistance = fromToVia + viaToFinalCity;

        // Compute the average speed using the formula: speed = distance / time
        double averageSpeed = totalDistance / timeTaken;

        // Print the travel details
        System.out.println("Travel Details for "+ name);
        System.out.println("Starting city: "+ fromCity);
        System.out.println("Via city: "+ viaCity);
        System.out.println("Final destination city: "+ toCity);
        System.out.println("Total distance traveled: "+ totalDistance);
        System.out.println("Average speed: "+ averageSpeed);

        // Close the scanner
        scanner.close();
    }
}
