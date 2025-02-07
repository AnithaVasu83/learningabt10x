package task_30;

import java.util.Scanner;

public class task10_grade {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        if(sc.hasNextInt())
        {
        int num=sc.nextInt();
        if(num >=0 && num<=100) {
            if (num >= 90 && num <= 100)
                System.out.println("Grade:A+");
            else if (num >= 80 && num <= 89)
                System.out.println("Grade:A");
            else if (num >= 70 && num <= 79)
                System.out.println("Grade:B");
            else if (num >= 60 && num <= 69)
                System.out.println("Grade:C");
            else if (num >= 50 && num <= 59)
                System.out.println("Grade:D");
            else if (num <= 40 && num >= 49)
                System.out.print("Grade:E");
            else System.out.println("FAIL");
        }
        else System.out.print("Enter the valid number");


        }else
        {   //sc.nextLine();
            System.out.print("Enter number only");
        }
        sc.close();
    }
}
//Enter the number: $%^))- for handling this type of inputs use sc.nextLine or sc.close()
//Enter the number
//Process finished with exit code 0
