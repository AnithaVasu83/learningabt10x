package task_1_31;

import java.util.Scanner;

public class task_18_electric_bill {
    // Electricity Bill Calculation (Based on Units Consumed)
    //
    //           :- take the input from the user of Units.
    //
    //    Implement Rate Structure:
    //
    //    Define the rate structure for calculating the bill based on the number of units consumed.
    //
    //            :-  First 100 units: 0.50Rs per unit
    //
    //            :-  Next 100 units (101-200): 0.75Rs per unit
    //
    //            :- Next 100 units (201-300): 1.20Rs per unit
    //
    //            :- Above 300 units: 1.50Rs per unit
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the units: ");
        int unit=sc.nextInt();
        double bill=0;
        if((unit > 0) && (unit <=100))
        {
            bill=unit*0.50;
            System.out.println("Bill Amount: ₹"+bill);
        }
        else if(unit >100 && unit <=200)
        {
            bill=unit*0.75;
            System.out.println("Bill Amount: ₹"+bill);
        }
        else if(unit >200 && unit <=300)
        {
            bill=unit*1.20;
            System.out.println("Bill Amount: ₹"+bill);
        }
        else if(unit >300)
        {
            bill=unit*1.50;
            System.out.println("Bill Amount: ₹"+bill);
        }

    }
}
