package task_1_30;

import java.util.Scanner;

public class task9_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if ((num % 4==0 && num %100 !=0) || num % 400==0)
                System.out.print(num + " is a leap year");
            else
                System.out.print(num + " is a not a leap year");
        }
    }
}
