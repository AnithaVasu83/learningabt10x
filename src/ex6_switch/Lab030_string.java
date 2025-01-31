package ex6_switch;

import java.util.Scanner;

public class Lab030_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String s1=sc.nextLine();
        switch (s1)
        {
            case "ex1_java_basics.Hello":
                System.out.println(s1);
                break;
            case "Hi":
                System.out.println("hiHello");
                break;
            default :
                System.out.println("my choice");
                break;
        }

    }
}
