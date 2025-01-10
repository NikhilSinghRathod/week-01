import java.util.*;
public class Pendistribution{
  public static void main (String[] args){

   //create a variable pen that holds the 
   //number of pen
   int pen = 14;
   
   //create a variable Student that indicates 
   // how many Student are present
   int student = 3;

   //create a variable reminder that indicates 
   //the remaining no of pens not distributed
   int reminder = pen%student;

  //create a variable Quantity that indicates
  //the no of pens distributed among student
   int quantity = pen/student;

   //print the no of pens per student and the
   //not distributed
   System.out.print(" The Pen Per Student is "+ quantity+" the remaining pen not distributed is " +reminder);

  }
}