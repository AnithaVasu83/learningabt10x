package ex5_if_else;

public class Lab022_if {
    public static void main(String[] args) {
        int num1=Integer.parseInt(args[0]);
        if(num1 <18) {
            System.out.println("not eligible to vote");

        }
        else
            System.out.println("eligible to vote");
    }
}
