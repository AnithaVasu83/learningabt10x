package task_1_31;
import java.util.Scanner;

public class task_20_net_salary {
    //Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,) Research from your side for this program.
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Basic pay: ");
        double basic_pay=sc.nextDouble();
        double hra=0.40*basic_pay;
        double da=.20*basic_pay;
        double gross_pay=basic_pay+hra+da;
        double total_income=gross_pay*12;
        double tax=0;
        if(total_income <= 400000 )
            System.out.println("No Tax");
        if((total_income > 400000) && (total_income <= 1500000)) {
            tax = (total_income - 400000)*0.05;
                    System.out.println("5% tax");
        }
        if((total_income >1500000) && (total_income <=30000000))
        {
            tax=(total_income - 1500000)*0.10+ (1500000 - 400000)*0.05;
            System.out.println("10% tax");
        }
        if(total_income > 30000000)
        {
            tax=(total_income - 30000000)*0.20+(3000000-1500000)*0.10+(1500000-400000)*0.05;
            System.out.println("20% tax");
        }
        System.out.println("Annual_tax: "+tax);
        double monthly_tax=tax/12;
        System.out.println("Monthly_tax: "+monthly_tax);
        double net_salary=gross_pay-monthly_tax;
        System.out.println("Your net_salary: "+net_salary);


    }
}
