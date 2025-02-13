package task_31;

import java.util.Scanner;

public class task_15_1_palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        if(sc.hasNextInt())
        {
            int num=sc.nextInt();
            //String str=Integer.toString(num);
            String str=String.valueOf(num);
            String sb=new StringBuilder(str).reverse().toString();
            if(str.equals(sb))
                System.out.println("Given number is palindrome");
            else
                System.out.println("Given  number is not palindrome");

        }
        else System.out.println("Enter the number only");

    }
}
