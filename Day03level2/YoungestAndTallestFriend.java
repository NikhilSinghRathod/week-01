import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
   
         // Create two arrays age and height 
         String[]names = {"Amar","Akbar","Anthony"};
         int[]age = new int[3];
         int[]height = new int[3];

        //create a scanner for user input
         Scanner sc =new Scanner(System.in);
        
       //taking input from user to store values
       for(int i =0 ; i<age.length;i++ ){
        System.out.println(" Enter the age of "+ names[i]);
         age[i] = sc.nextInt();
        System.out.println(" Enter the Height of "+ names[i]);
         height[i] = sc.nextInt();
       }
     
      //find the youngest and the tallest
      int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
     // Display the results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + age[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + height[tallestIndex] + " cm.");

        // Close the scanner
        sc.close();
    }
}