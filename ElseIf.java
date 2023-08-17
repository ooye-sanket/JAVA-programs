public class ElseIf {
    public static void main(String args []){
        int age = 12;
        if(age >= 10){
            System.out.println("adult");
        } 
        else if (age >= 13 && age <= 10) {
         System.out.println("Teenager");
        }
        else {
            System.out.println("child");
        }
    }
    
}
