import java.util.Scanner;

public class VotingStudent {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //create an array to initialize the value
        int [] age = new int[10];
         
        //Creating a for loop to take user input
        for(int i=0 ; i<age.length ; i++){
          System.out.println("Please enter the age of Student : ");
           age[i]=sc.nextInt();
        }

        //create a for loop to check whether it is 
        //Eligible for voting or not
        for(int x =0 ; x<age.length; x++){
        
        int current = age[x];
        
        if(current>=18){
        System.out.println("The Student with age "+ current +" can Vote ");
        }else if(current<18 && current>=0){
        System.out.println("The Student with age "+ current +" cannot Vote ");
        }else{
        System.out.println("Invalid age");
        }
    }
 }
}