package ex5_if_else;

import java.util.Scanner;

public class Lab026_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        if(sc.hasNextInt())
        {
            int num=sc.nextInt();
            if(num % 2 == 0)
                System.out.println("Given number is even");
            else
                System.out.println("Given number is odd");
        }
        else
            System.out.println("invalid output");

    }
}
