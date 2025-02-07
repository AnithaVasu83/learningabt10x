package task_30;
import java.util.Scanner;

public class task7_smallest_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.print("Enter the 2nd number: ");
            int num1 = sc.nextInt();
            if (num < num1)
                System.out.print("Smallest number: " + num);
            else System.out.println("Smallest number is " + num1);
        }else System.out.println("Not a valid input");
    }
}
