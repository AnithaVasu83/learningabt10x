package task_31;
import java.util.Scanner;

public class task_16_armstrong_number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int originalnum=num;//is must to compare because num value changes
        int n=String.valueOf(num).length();
        int sum=0;
        while (num >0)
        {
            int digit=num%10;//extracts last digit
            sum += (int)Math.pow(digit, n);
            num /=10;//remove the last digit

        }
        if(originalnum == sum)
            System.out.println("Given number is Armstrong number");
        else System.out.println("Given number is not armstrong number");


    }
}
