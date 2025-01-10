import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Prompt the user to enter the total number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the remaining chocolates after distribution
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.printf("The number of chocolates each child gets is "+ chocolatesPerChild + " and the number of remaining chocolates are"+remainingChocolates);
                          
        // Close the scanner
        scanner.close();
    }
}
