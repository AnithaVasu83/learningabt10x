package task_feb_1;

import java.util.Scanner;

public class task_23_days_month_year {
    //Convert Days into Years, Months, and Days.
    //
    //       :- Take the Days Input from the User
    //
    //    Define the conversion logic:
    //
    //        :- Assume 1 year = 365 days.
    //
    //        :- Assume 1 month = 30 days
    //
    //        :- Convert the Days into Years, Month and days and Print it.
    //
    //if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the days: ");
        long days=sc.nextLong();
        long years=days / 365;
        long rem_days=days%365;
        long months=rem_days/30;
        long rem_days2=rem_days % 30;
        System.out.println(years+" years "+months+" months "+rem_days2+" days");


    }
}
