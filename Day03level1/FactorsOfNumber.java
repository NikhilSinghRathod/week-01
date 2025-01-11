import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Validate the input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return; // Exit the program
        }

        // Initialize variables
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0; // To track the current position in the factors array

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor of the number
                // Add the factor to the array
                factors[index++] = i;

                // Check if the array needs resizing
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size of the array
                    int[] temp = new int[maxFactor]; // Temporary array with new size

                    // Copy elements from the old array to the new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign the temp array to the factors array
                    factors = temp;
                }
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
