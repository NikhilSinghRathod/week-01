import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter the starting number for the countdown
        System.out.print("Enter the starting number for the countdown: ");
        int counter = sc.nextInt(); // Read the input value

        // Countdown logic using a while loop
        while (counter >= 1) {
            // Print the current value of the counter
            System.out.println(counter);

            // Decrement the counter by 1
            counter--;
        }

        // Print the rocket launch message
        System.out.print("Liftoff ");

        // Close the scanner to free resources
        sc.close();
    }
}
