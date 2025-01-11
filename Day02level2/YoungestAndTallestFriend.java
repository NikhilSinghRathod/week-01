import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking input for ages and heights of the 3 friends
        System.out.print("Enter the age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int anthonyHeight = sc.nextInt();

        // Finding the youngest friend based on age
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Finding the tallest friend based on height
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Output the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        // Close the scanner
        sc.close();
    }
}
