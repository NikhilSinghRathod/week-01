import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        // Create an array to store up to 10 numbers
        double[] numbers = new double[10];
        // Variable to store the total sum
        double total = 0.0;
        // Variable to track the index of the array
        int index = 0;

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative number to stop): ");
            double input = sc.nextDouble();

            // Check if the user entered 0 or a negative number
            if (input <= 0) {
                break; // Exit the loop
            }

            // Check if the array limit of 10 is reached
            if (index == 10) {
                System.out.println("Array is full. Cannot store more numbers.");
                break; // Exit the loop
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the total sum of the entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the entered numbers
        System.out.println("\nEntered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum
        System.out.println("\nTotal Sum of Numbers: " + total);

        // Close the scanner
        sc.close();
    }
}
