package task_1_29_jan;

import java.util.Scanner;

public class task00_scanner {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(sc.hasNextInt()) { //waits here for the input
            System.out.println(sc.hasNextInt());
            System.out.println(num);
        }
        else System.out.println("not valid");
    }
}
//Enter the number: 13
//16
//true
//13
//Enter the number: 13
//7.45
//not valid