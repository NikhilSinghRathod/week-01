import java.util.*;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // uset to enter the month, day, and year
        System.out.println("Enter the Month :");
        int month = sc.nextInt(); // Month
        System.out.println("Enter the Day :");
        int day = sc.nextInt();   // Day 
        System.out.println("Enter the Year :");
        int year = sc.nextInt(); // Year

        // Calculate intermediate values using the given formulas
        int y0 = year - (14 - month) / 12;                          // Adjusted year
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;                  // Leap year adjustment
        int m0 = month + 12 * ((14 - month) / 12) - 2;             // Adjusted month
        int d0 = (day + x + (31 * m0) / 12) % 7;                   // Day of the week

        // Output the result
         switch(d0){
          
         case 0 : System.out.println("Sunday");
                break;    
         case 1 : System.out.println("Monday");
                break;
         case 2 : System.out.println("Tuesday");
                break;
         case 3 : System.out.println("Wednesday");
                break;
         case 4 : System.out.println("Thrusday");
                break;
         case 5 : System.out.println("Friday");
                break;
         case 6 : System.out.println("Saturday");
                break;
         }
            }
}
