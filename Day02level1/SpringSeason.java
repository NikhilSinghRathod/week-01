
import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //  the user to enter a number
        System.out.print("Enter the month number : ");
        int month = sc.nextInt(); // Read the number input
        
        System.out.print("Enter the day number : ");
        int day = sc.nextInt(); // Read the number input


        // Check if the date falls within the spring season
         // March: Spring starts on the 20th
        if (month == 3 && day >= 20 && day <= 31) {
            System.out.println("It's a Spring Season.");

        }
        // April: Entire month is spring
        else if (month == 4 && day >= 1 && day <= 30) {
            System.out.println("It's a Spring Season.");

        }
        // May: Entire month is spring
        else if (month == 5 && day >= 1 && day <= 31) {
            System.out.println("It's a Spring Season.");

        }
        // June: Spring ends on the 20th
        else if (month == 6 && day >= 1 && day <= 20) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
 
           sc.close();
    }
 }
}

