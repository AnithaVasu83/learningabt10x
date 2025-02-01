package Task;

import java.util.Scanner;

public class task1_positive {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        if(sc.hasNextInt())
{    int num=sc.nextInt();
        if (num >0)
            System.out.println("positive number");
        else if(num <0)
            System.out.println("negative number");
        else System.out.println("neutral number");
}
else System.out.println("Enter the valid input");
    }
}
