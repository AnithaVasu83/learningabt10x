package task_5_feb;
// Calculate sum of first 10 natural numbers

public class task_34 {
    public static void main(String[] args)
    {
     int num=1;
     int sum=0;
     while(num <=10)
     {
         sum +=num;
         num++;
     }
     System.out.println("Sum of first 10 natural numbers: "+sum);
    }
}
