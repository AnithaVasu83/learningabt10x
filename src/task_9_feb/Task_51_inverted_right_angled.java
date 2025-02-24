package task_9_feb;
//*****
// ****
//  ***
//   **
//    *
import java.util.Scanner;
public class Task_51_inverted_right_angled {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {   for(int j=1;j<i;j++)
               System.out.print(" ");
            for(int j=row;j>=i;j--)
                System.out.print("*");
            System.out.println();
        }



    }
}
