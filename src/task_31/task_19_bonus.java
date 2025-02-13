package task_31;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class task_19_bonus {
    // Calculate Bonus Based on Salary and Years of Experience.
    //
    //          :- take the salary and Year info from the User.
    //
    //Implement Bonus Calculation Logic:
    //
    //     Define the bonus structure based on salary and years of experience.
    //
    //           :- If years of experience is less than 1 year: No bonus.
    //
    //           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
    //
    //           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
    //
    //           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
    public static void main(String[] args)
    {

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter your salary: ");
     double salary=sc.nextDouble();
     System.out.print("Enter your years of experience: ");
     int year=sc.nextInt();
     double bonus=0;
     if(year <1)
         System.out.println("No Bonus.Your bonus: "+bonus);
     if(year >=1 && year <=3)
     {
         bonus=salary*0.05;
         System.out.println("Bonus 5% of the salary.");
         System.out.println("Your bonus: "+bonus);
     }
     if(year >=4 && year <=6)
     {
         bonus=salary*0.10;
         System.out.println("Bonus 10% of the salary.");
         System.out.println("Your bonus: "+bonus);
     }
     if(year >6)
     {
         bonus=salary*0.15;
         System.out.println("Bonus 15% of the salary.");
         System.out.println("Your bonus: "+bonus);
     }
     double netsalary=salary + bonus;
        System.out.println("Net salary: "+netsalary);



    }
}
