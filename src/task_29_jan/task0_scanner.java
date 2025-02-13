package task_29_jan;

import java.util.Scanner;

public class task0_scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input: ");//println prints the input in next line
        // pressing enter newline(\n) character generates
        int num=sc.nextInt();
        System.out.print("Enter the another one: ");
        String str=sc.nextLine();
        System.out.println(num + str);
        System.out.print("Enter the input: ");//prints in the same line
        int num1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the another one: ");
        String str1=sc.nextLine();
        System.out.println(num1 + str1);


    }
}
