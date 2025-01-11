import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if the current value is a multiple of the number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }

        // Close the scanner
        sc.close();
    }
}
