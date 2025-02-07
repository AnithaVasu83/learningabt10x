package ex6_switch;

import java.util.Scanner;

public class Lab033_modern_switch1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cases: ");
        String s1=sc.nextLine();

        int num=switch (s1)
        {
            case "hello","world"-> 10;
            case "hi"->20;
            default->100;
        };
        System.out.println("Just for fun: "+num);
        System.out.print("Enter the cases: ");
        int x=sc.nextInt();
        String s2=switch(x) {
            case 1 -> "hello";
            case 3 -> "world";
            default -> "Hello World";
        };
        System.out.println(s2);
        int a=5;
        int x1=switch (a)
        {
            case 2-> 3;
            case 5-> 6;
            default->7;
        };
        System.out.println(x1);
    }
}
