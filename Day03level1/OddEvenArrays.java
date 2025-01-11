import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // Exit the program
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even numbers
        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Save even number in the evenNumbers array
                evenNumbers[evenIndex++] = i;
            } else {
                // Save odd number in the oddNumbers array
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers array
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print the even numbers array
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
