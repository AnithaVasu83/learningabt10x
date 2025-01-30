package ex6_switch;

import java.util.Scanner;

public class Lab032_modern_switch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cases: ");
        int num1=sc.nextInt();

    switch (num1)
        {
            case 2 -> System.out.println("Even number");//no need for break statement
            case 3-> System.out.println("odd number");
            default-> System.out.println("just checking the switch with multiple case condition");
        };
        //System.out.println("number: "+s);
        switch (num1)
        {
            case 2,4,6:
                System.out.println("Even numbers");
                break;
            case 1,3,5:
                System.out.println("odd number");
                break;
            default:
                System.out.println("just checking the switch with multiple case condition");
                break;

        }
    }
}
