import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Variable to store the greatest factor (excluding the number itself)
        int greatestFactor = 1;

        // Loop to find the greatest factor from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                greatestFactor = i; // Assign the factor to greatestFactor
                break; // Exit the loop once the greatest factor is found
            }
        }

        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        // Close the scanner
        sc.close();
    }
}
