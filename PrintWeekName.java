import java.util.*;
public class PrintWeekName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of week(1 to 7): ");
        int week = sc.nextInt();
        switch(week){
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thrusday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("Saturday");
            break;
            default : System.out.println("wrong week");
        } 
    }
    
}
