package ex5_if_else;

import java.util.Scanner;

public class Lab025_check_numbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        if (sc.hasNextInt())
        {
        int num1=sc.nextInt();
            if (num1 > 0)
                System.out.println("Given number is positive");
            else if(num1 <0)
                System.out.println("Given number is negative");
            else
                System.out.println("Zero is neither positive nor negative");
        }
        else
            System.out.println("invalid input");


    }
}
