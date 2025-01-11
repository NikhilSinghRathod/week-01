import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // The user to enter the first number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble(); // Read the first number

        //  The user to enter the second number
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble(); // Read the second number

        // The user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next(); // Read the operator

        // Variable to store the result of the operation
        double result;

        // Perform the operation based on the operator using switch-case
        switch (op) {
            case "+":
                result = first + second; // Addition
                System.out.println(first + " + " + second + " = " + result);
                break;

            case "-":
                result = first - second; // Subtraction
                System.out.println(first + " - " + second + " = " + result);
                break;

            case "*":
                result = first * second; // Multiplication
                System.out.println(first + " * " + second + " = " + result);
                break;

            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second; // Division
                    System.out.println(first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                // Handle invalid operator input
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        // Close the scanner to free resources
        sc.close();
    }
}
