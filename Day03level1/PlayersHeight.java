import java.util.Scanner;

public class PlayersHeight {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Declare an integer array to store the results of multiplication
        double[] heights = new double[11];
      
        //sum variable initialized to 0
         double sum =0.0;

        for(int i=0;i<heights.length;i++){
        //  the user for input
        System.out.print("Enter the heights of player ");
         heights[i]=sc.nextDouble();
        }
      
        //Adding all the height to the sum variables
        for(int i=0;i<heights.length;i++){
          sum+=heights[i];
         }
         
       // formula for the calculation of the height
        double mean = sum/heights.length;

       System.out.println("The mean height of the football team is "+mean);
  
    }
 }