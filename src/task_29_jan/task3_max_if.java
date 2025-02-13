package task_29_jan;

import java.util.Scanner;

public class task3_max_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.print("enter the second number: ");
            int num1 = sc.nextInt();
            if (num > num1)
                System.out.println("biggest number: " + num);
            else if (num < num1)
                System.out.println("biggest number: " + num1);
            else System.out.println("both are equal");
        }
        else if(sc.hasNextFloat())
        {
            float num = sc.nextFloat();
            System.out.print("enter the second number: ");
            float num1 = sc.nextFloat();
            if (num > num1)
                System.out.println("biggest number: " + num);
            else if (num < num1)
                System.out.println("biggest number: " + num1);
            else System.out.println("both are equal");
        }

    }
}
