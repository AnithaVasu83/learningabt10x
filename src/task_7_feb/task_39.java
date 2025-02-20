package task_7_feb;

import java.util.Scanner;

// Factorial of a Number
public class task_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int num = sc.nextInt();
        int fac = 1;
        if (num == 0 || num == 1)
            System.out.printf("Factorial of %d: 1", num);
        else {
            for (int i = 2; i <= num; i++) {
                fac *= i;
            }
            System.out.printf("Factorial of %d: %d ",num,fac);

        }
    }
}
