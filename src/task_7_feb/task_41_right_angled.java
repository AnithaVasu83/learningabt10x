package task_7_feb;
import java.util.Scanner;
//right angled triangle
//   *
//   **
//   ***
//   ****
//   *****

public class task_41_right_angled {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
