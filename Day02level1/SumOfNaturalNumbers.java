
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter a number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt(); // Read the user input

        // Check if the number is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return; // Exit if the input is not a valid natural number
        }

        // Compute the sum using the formula n * (n + 1) / 2
        int formulaSum = n * (n + 1) / 2;

        // Compute the sum using a while loop
        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i; // Add i to the sum
            i++; // Increment i
        }

        // Display the results from both computations
        System.out.println("Sum using the formula: " + formulaSum);
        System.out.println("Sum using the while loop: " + loopSum);

        // Compare both results
        if (formulaSum == loopSum) {
            System.out.println("Both methods give the same result, the computation is correct");
        } else {
            System.out.println("There is an error in the computation.");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

