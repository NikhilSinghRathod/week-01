import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner
        sc.close();
    }
}
