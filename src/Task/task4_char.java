package Task;

import java.util.Scanner;

public class task4_char {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s1=sc.nextLine();
        for(int i=0;i<s1.length(); i++)
        {
            if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'
            ||s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
                System.out.println(s1.charAt(i)+ " is a vowel" );
            else System.out.println(s1.charAt(i) + " is a consonant");
        }

    }
}
