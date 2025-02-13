package task_29_jan;

import java.util.Scanner;

public class task4_1_char1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Charcter: ");
        char ch1=sc.nextLine().charAt(0);
        char ch=Character.toLowerCase(ch1);
        if(Character.isLetter(ch))
        {
            switch (ch)
            {
                case 'a','e','i','o','u'-> System.out.println(ch1+" is a vowel");
                default-> System.out.println(ch1+" is a consonant");
            }
        }
        else System.out.println("Enter the valid input");




    }
}
