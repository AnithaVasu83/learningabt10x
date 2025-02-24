package task_9_feb;
import java.util.Scanner;
//*****
//****
//***
//**
//*
public class Task_47_left_triangle_inverted {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=row;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
