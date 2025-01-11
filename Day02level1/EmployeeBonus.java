
import java.util.Scanner;

public class EmployeeBonus{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter the salary and years of service
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble(); // Read salary input

        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt(); // Read years of service input

        // Check if the employee has more than 5 years of service
        if (yearsOfService > 5) {
            // Calculate 5% bonus for employees with more than 5 years of service
            double bonus = salary * 0.05;
            System.out.println("The bonus for the employee is: INR" + bonus);
        } else {
            // No bonus if the employee has 5 or fewer years of service
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the scanner 
        sc.close();
    }
}

