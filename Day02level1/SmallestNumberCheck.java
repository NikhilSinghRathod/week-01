import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // The user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt(); // Read the first number

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt(); // Read the second number

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt(); // Read the third number

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println(" The first number is the smallest among 3 ");
        } else {
            System.out.println("The first number is not smallest among 3");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

