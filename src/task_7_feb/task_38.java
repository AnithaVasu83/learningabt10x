package task_7_feb;
import java.util.Scanner;
//Multiplication Table of a Given Number (take the input from user).
public class task_38 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Multiplication table of: ");
       int num=sc.nextInt();
       for(int i=1;i<=10;i++)
       {
        System.out.printf("Multiplication if %d*%d=%d%n",i,num,i*num);
       }

    }
}
