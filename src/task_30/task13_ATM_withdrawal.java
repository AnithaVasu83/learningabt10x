package task_30;

import java.util.Scanner;

public class task13_ATM_withdrawal {
    public static void main(String[] args)
    {
        double account_balance=10000;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        if(sc.hasNextDouble())
        {
            double num=sc.nextDouble();
            if(num>0 && num%100==0 && num<account_balance)
            {
                double account_balance1=account_balance-num;
                System.out.println("Amount withdrawn.Your available balance is "+account_balance1);

            }
            else if(num <=0)
                System.out.println("Enter amount greater than Zero");
            else if(num > account_balance)
                System.out.println("Unable to withdraw since the amount you entered exceeds available balance");
            else System.out.println("Amount should be multiple of 100");
        }
        else System.out.println("Enter number only");
        sc.close();
    }
}
