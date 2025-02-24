package task_1_30;

import java.util.Scanner;

public class task14_valid_triangle {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 1st sides: ");
     if(sc.hasNextInt()) {
         int num1 = sc.nextInt();
         System.out.println("Enter the 2nd sides: ");
         int num2 = sc.nextInt();
         System.out.println("Enter the 3rd sides: ");
         int num3 = sc.nextInt();
         if ((num1 + num2 > num3) && (num2 + num3 > num1) && (num1 + num3 > num2))
             System.out.println("Triangle is valid ");
         else System.out.println("Triangle is invalid");
     }
     else System.out.println("Enter integer only");
        sc.close();
    }

}
