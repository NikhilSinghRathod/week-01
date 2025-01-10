import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value of a (double): ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b (double): ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c (double): ");
        double c = sc.nextDouble();

        // Perform the double operations with precedence
        double result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c; // Multiplication (*) is done first, then addition (+)
        double result3 = c + a / b; // Division (/) is done before addition (+)
        double result4 = a % b + c; // Modulus (%) is done first, then addition (+)

        // Print the results
        System.out.println("The results of Double Operations are:\n");
        System.out.println("a + b * c = "+ result1);
        System.out.println("a * b + c = "+ result2);
        System.out.println("c + a / b = "+ result3);
        System.out.println("a %% b + c = "+ result4);

        // Close the scanner
        sc.close();
    }
}
