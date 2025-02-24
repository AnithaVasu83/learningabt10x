package task_1_31;

import java.util.Scanner;

public class task_15_2_palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        String str=String.valueOf(num);
        int right=str.length()-1;
        int left=0;
        while(left<right){

            if(str.charAt(left) != str.charAt(right)) {
                System.out.print("Given number is not palindrome");
                //break; exits the loop but prints "Given number is palindrome" so use return it exit the program immediately
                return;// when used in void method it exits the method

            }

                left++;
                right--;
            }

        System.out.print("Given number is palindrome");

        }




    }
    //number of iteration is unknown(half of string),checking two pointers inside the string


