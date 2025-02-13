package task_29_jan;

import java.util.Scanner;

public class task4_2_char {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character: ");
        String str=sc.nextLine();
        if(str.length()==1 && Character.isLetter(str.charAt(0)))
        {
            char ch=str.charAt(0);
            char ch1=Character.toLowerCase(ch);
            if (ch1 == 'a' ||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
                System.out.println(ch + " is a vowel");
            else
                System.out.println(ch +" is cosonant");



        }
        else System.out.println("Enter the valid input");

    }
}
