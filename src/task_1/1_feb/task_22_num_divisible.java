package task_feb_1;

import java.util.Scanner;

public class task_22_num_divisible {
    // Check if a Number is Divisible by 5 and 11
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(num %5==0 && num % 11==0)
            System.out.println("Given number is divisible by 5 and 11");
        else System.out.println("Given number is not divisible by 5 and 11");

    }
}
