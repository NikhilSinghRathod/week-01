import java.util.Scanner;

public class EvenOddChecking {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //create an array to initialize the value
        int [] numbers = new int[5];
         
        //Creating a for loop to take user input
        for(int i=0 ; i<numbers.length ; i++){
          System.out.println("Please enter the age of Student : ");
           numbers[i]=sc.nextInt();
        }
         
       //checking for whether the number is positive negative or zero
       for(int j=0 ; j<numbers.length ; j++){
        int curr = numbers[j];
       
       //checking for whether the number is greater than zero
       if(curr>0){
        if(curr%2 == 0){
         System.out.println(" The number is Even ");
         }else {
          System.out.println(" The number is odd ");
         }
       }else if(curr==0){
        System.out.println(" The number is zero ");

       }else{
       System.out.println(" The number is negative ");

       }
     }
   }
 }