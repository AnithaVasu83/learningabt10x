package task_7_feb;
//*****
//****
//***
//**
//*

import java.util.Scanner;

public class task_42_inverted_right_angle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int num=sc.nextInt();
        int num1=num;
        for(int i=1;i<=num;i++)
        {
            //for(int j=1;j<=num1;j++)
            for(int j=num;j>=i;j--)
                System.out.print("*");
            System.out.println();
            //num1--;
        }

    }
}
