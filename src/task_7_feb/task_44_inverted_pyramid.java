package task_7_feb;

import java.util.Scanner;

public class task_44_inverted_pyramid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<i;j++)
                System.out.print(" ");
            for(int j=1;j<=(2*(row-i)+1);j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
