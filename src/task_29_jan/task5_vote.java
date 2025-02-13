package task_29_jan;

import java.util.Scanner;

public class task5_vote {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age: ");
        //int num=sc.nextInt();
        if(sc.hasNextInt())
        {
            int num=sc.nextInt();

            if(num >=18)
                System.out.println("eligible for vote");
            else System.out.println("Not eligible for vote");
        }
        else
            System.out.println("Enter the valid input");
    }
}
//int num=sc.nextInt();
//if(sc.hasNextInt()) if placed like this it waits for next input,this is wrong
//Enter th age: 18 ->  hasNextInt waits for next input
//18 -> if we give input it works further
//eligible for vote

