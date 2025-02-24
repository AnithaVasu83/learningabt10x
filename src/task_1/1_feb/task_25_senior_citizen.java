package task_feb_1;

import java.util.Scanner;

public class task_25_senior_citizen {
    //Find if a Person is Senior Citizen Based on Age.
    //
    //         :- take the age input from the user.
    //
    //        Implement Age Category Logic:
    //
    //Define the criteria for different age categories:
    //
    //Child: Age 0 to 12
    //
    //Teenager: Age 13 to 19
    //
    //Adult: Age 20 to 64
    //
    //Senior Citizen: Age 65 and older
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        if(age > 0 && age <=12)
            System.out.println("The person is a child");
        else if(age >12 && age <=19)
            System.out.println("The person is a teenager");
        else if(age >20 && age <=64)
            System.out.println("The person is adult");
        else if(age >= 65)
            System.out.println("The person is a senior citizen");
    }
}
