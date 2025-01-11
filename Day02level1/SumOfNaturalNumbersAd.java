
import java.util.Scanner;

public class SumOfNaturalNumbersAd {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt(); // Read the user input

        // Check if the number is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return; // Exit if the input is not a valid natural number
        }

        // Compute the sum using the formula n * (n + 1) / 2
        int formulaSum = n * (n + 1) / 2;

        // Compute the sum using a for loop
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i; // Add i to the sum
        }

        // Display the results from both computations
        System.out.println("Sum using the formula: " + formulaSum);
        System.out.println("Sum using the for loop: " + loopSum);

        // Compare both results
        if (formulaSum == loopSum) {
            System.out.println("Both methods give the same result, the computation is correct!");
        } else {
            System.out.println("There is an error in the computation.");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

