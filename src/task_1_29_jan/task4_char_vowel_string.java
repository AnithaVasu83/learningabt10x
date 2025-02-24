package task_1_29_jan;

import java.util.Scanner;

public class task4_char_vowel_string {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s1=sc.nextLine();
        char[] arr=s1.toCharArray();
        for(int i=0;i<s1.length(); i++)  
        {
            //char ch=s1.charAt(i);
            switch(arr[i])//switch(arr) is wrong since arr is array
            {
                case 'a','e','i','o','u'-> System.out.println("vowel");
                default -> System.out.println("consonant");
            }
            //if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'
            //||s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
            //    System.out.println(s1.charAt(i)+ " is a vowel" );
            //else System.out.println(s1.charAt(i) + " is a consonant");
        }

    }
}
