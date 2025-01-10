import java.util.*;

public class UnitPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // the user to enter the unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Print the result
        System.out.print("The total purchase price is INR " +totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);

        // Close the scanner
        sc.close();
    }
}