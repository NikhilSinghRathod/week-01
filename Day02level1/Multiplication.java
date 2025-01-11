
import java.util.Scanner;
public class Multiplication {
   public static void main (String [] args){
     
       // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // the user to enter the salary and years of service
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
            int number = sc.nextInt();
               
       //used for the printing of multiplication
       for(int i =6; i<=9 ; i++){
        System.out.print(number + " * "+ i +" = "+(number*i)+"\n");
     }      
   
       sc.close();
 }
}

