import java.util.*;

public class EVENandOODIfelseExample2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = sc.nextInt();

        if (number % 2 == 0 ){
            System.out.println("number is Even");

        } else {
            System.out.println("number is ood");
        }
    }
}
/* without scnner function code
 public class EVENandOODIfelseExample2 {

    public static void main(String arg[]){
        int a = 8;
        int b = 2;
        if (a % 2 == 0 ){
            System.out.println("a is Even");

        } else {
            System.out.println("a is ood");
        }
    }
} 
*/