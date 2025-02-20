package task_7_feb;

import java.util.Scanner;

// Check if a Number is Prime
public class task_40 {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num=sc.nextInt();
      if(num == 0)
      {
          System.out.println("Given number is not a prime number");
          return;
      }
      if((num == 2) || (num%2)==0)
      {
          System.out.println("Given number is a prime number");
          return;
      }


    }
}
