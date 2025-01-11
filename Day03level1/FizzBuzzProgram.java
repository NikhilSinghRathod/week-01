import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Validate the input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return; // Exit the program
        }

        // Create a String array to save the results
        String[] results = new String[number + 1];

        // FizzBuzz logic to populate the array
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiple of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Multiple of 5
            } else {
                results[i] = String.valueOf(i); // Not a multiple of 3 or 5
            }
        }

        // Display the results in the specified format
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the scanner
        sc.close();
    }
}
