 import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt(); // Read the age input

        // Check if the age is 18 or greater
        if (age >= 18) {
            // If age is 18 or greater, the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If age is less than 18, the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

