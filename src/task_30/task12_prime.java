package task_30;

import java.util.Scanner;

public class task12_prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        if(sc.hasNextInt())
        {
            int num=sc.nextInt();
           // if((num>1 && num %2 !=0) || num==2) wrong in case of 9,reminder is not equal to 0 but it not a prime number
           // if(num >=2 && num %2 !=0) is wrong if we enter 2 1st condition will satisfied not 2nd one returns not prime
            if(isprime(num))
                System.out.println(num+" is a prime number");
            else System.out.println(num+" is not a prime number");
        }
        else System.out.println("Enter number only");
        sc.close();
    }
    public static boolean isprime(int num)
    {
        if(num <=1)
            return false;
        if(num == 2) return true;
        if(num %2 ==0) return false;

        for(int i=3;i<=Math.sqrt(num);i +=2)
            {
                if(num %i==0)
                    return false;
        }return true;//the reason it is not placed inside the for is because loop runs only one iteration and returns true even if the number is not prime
        //25 it checks 25%3 !=0 and returns true(prime) without checking 25%5 ==0 (not prime)
    }
}
