import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        //  the user for input
        System.out.print("Enter an integer to display its multiplication table: ");
        int number = sc.nextInt();

        // Declare an integer array to store the results of multiplication
        int[] multiplicationTable = new int[10];

        // Run a loop from 1 to 10 and store the results in the multiplication table array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i; // Store the result at the correct index
        }

        // Display the result in the specified format
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            // Print each result from the array
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        // Close the scanner
        sc.close();
    }
}
