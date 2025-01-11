import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt(); // Read the year input

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The LeapYear program only works for years >= 1582.");
        } else {
            //  Using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

        // Close the scanner to free resources
        sc.close();
    }
}
}
