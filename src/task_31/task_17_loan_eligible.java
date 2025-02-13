package task_31;

import java.util.Scanner;

public class task_17_loan_eligible {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=sc.nextInt();
        System.out.println("Enter the salary: ");
        double salary=sc.nextDouble();
        System.out.println("Enter the credit score: ");
        int credit_score=sc.nextInt();

        if((age >0) && (age >18) && (age <80))
            System.out.println("Age is eligible");
        else
        {
            System.out.println("Age must be between 18 and 80");
            return;
        }
         if((salary >0) && (salary > 30000))
             System.out.println("Salary is eligible");
         else {
             System.out.println("Salary should be greater than 30000");
             return;
         }
         if((credit_score>0) && (credit_score > 650) && (credit_score < 850))
        {
            System.out.println("Credit score is eligible for loan");
        }
         else {
             System.out.println("Credit score should be between 650 and 850");
             return;
         }
        System.out.println("Person is eligible for loan!!!");

    }
}
