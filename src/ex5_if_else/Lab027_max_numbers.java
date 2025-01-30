package ex5_if_else;

import java.util.Scanner;

public class Lab027_max_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2=sc.nextInt();
        if(num1 > num2)
            System.out.println("biggest number: "+num1);
            else if(num1 < num2)
            System.out.println("biggest number: "+num2);
            else
            System.out.println("both are equal");



    }
}
