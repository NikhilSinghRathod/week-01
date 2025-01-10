import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the salary amount
        System.out.print("Enter the salary (INR): ");
        double salary = sc.nextDouble();

        // Prompt the user to enter the bonus amount
        System.out.print("Enter the bonus (INR): ");
        double bonus = sc.nextDouble();

        // Compute the total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Print the result
        System.out.print("The salary is INR "+ salary +" and bonus is INR "+ bonus +" Hence Total Income is INR "+ totalIncome);

        // Close the scanner
        sc.close();
    }
}