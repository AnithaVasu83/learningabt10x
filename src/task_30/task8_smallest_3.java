package task_30;

import java.util.Scanner;

public class task8_smallest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.print("Enter the 2nd number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the 3rd number: ");
            int num2 = sc.nextInt();
            if (num < num1 && num < num2)
                System.out.println("Smallest number is: " + num);
            else if (num1 < num && num1 < num2)
                System.out.println("Smallest number is: " + num1);
            else System.out.println("Smallest number is: " + num2);
        } else
            System.out.println("Enter the valid input");

    }
}
