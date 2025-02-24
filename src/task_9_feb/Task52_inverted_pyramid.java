package task_9_feb;

import java.util.Scanner;

public class Task52_inverted_pyramid {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<i;j++)
                System.out.print(" ");
            for(int k=i;k<=2*row-i;k++)
                    System.out.print("*");
            System.out.println();
        }
    }
}
