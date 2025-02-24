package task_1_31;

import java.util.Scanner;

public class task_21_travel {
    // Find if a Person Can Travel Based on Visa Status and Age.
    //
    //     take the input from the user for
    //
    //            Age (integer).
    //
    //            Visa Status (String or boolean).
    //
    //     Check Eligibility:
    //
    //             :- If age is 18 or older and visa status is valid, the person can travel.
    //
    //Otherwise, the person cannot travel.
    //
    //        Validation Criteria
    //
    //                Age: - Must be a non-negative integer.
    //
    //                         :- Should be greater than or equal to 18 to be eligible to travel.
    //
    //        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
    //
    //                               :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the visa status: ");
        boolean b = sc.nextBoolean();
        boolean can_travel = true;
        if (age < 0) {
            System.out.println("Age must be non-negative number");
            can_travel = false;
        } else if (age < 18) {
            System.out.println("Age should be greater than 18");
            can_travel = false;
        } else System.out.println("Age is valid");
        if (b)
            System.out.println("Visa status is valid");
        else {
            System.out.println("Visa status is invalid");
            can_travel = false;
        }
        if (can_travel)
            System.out.println("The person is eligible to travel");
        else System.out.println("The person is ineligible to travel");
    }
}
