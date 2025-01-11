import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        // Define constants
         int NUM_EMPLOYEES = 10;
         double BONUS_RATE_HIGH = 0.05; // 5% for service > 5 years
         double BONUS_RATE_LOW = 0.02;  // 2% for service <= 5 years

        // Arrays to store salaries, years of service, bonuses, and new salaries
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];

        // Variables for total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input salaries and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = sc.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double serviceYears = sc.nextDouble();

                // Validate input
                if (salary > 0 && serviceYears >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = serviceYears;
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Invalid input. Please enter a positive salary and non-negative years of service.");
                    
                }
            }
        }

        // Calculate bonus, new salaries, and totals
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * BONUS_RATE_HIGH;
            } else {
                bonuses[i] = salaries[i] * BONUS_RATE_LOW;
            }

            // Calculate new salary
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results for each employee
        System.out.println("Employee Bonus and Salary Details:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Employee "+ i +" Old Salary "+ salaries[i] +"  Bonus "+ bonuses[i] +" New Salary "+ newSalaries[i]);
        }

        // Display total bonus and salaries
        System.out.println(" Summary: ");
        System.out.println("Total Old Salary: "+ totalOldSalary);
        System.out.println("Total Bonus Payout: "+ totalBonus);
        System.out.println("Total New Salary: "+ totalNewSalary);

        // Close the scanner
        sc.close();
    }
}
