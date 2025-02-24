package task_1_30;

import java.util.Scanner;

public class task11_is_alphabet {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        //char ch=sc.next().charAt(0);
        //if(Character.isLetter(ch))
        String str=sc.nextLine();
        if(str.length()==1 && Character.isLetter(str.charAt(0)))
            System.out.println("Given character is a alphabet");
        else {
            //sc.nextLine(); no need for this here instead use sc.close()
            //because we take input in nextLine()
            System.out.println("Enter single alphabet only");
        }
          sc.close();
    }
}
