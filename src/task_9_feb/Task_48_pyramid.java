package task_9_feb;
import java.util.Scanner;
//    *
//   ***
//  *****
// *******
//*********

public class Task_48_pyramid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
