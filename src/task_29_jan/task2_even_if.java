package task_29_jan;

public class task2_even_if {
    public static void main(String[] args)
    {

        int num=Integer.parseInt(args[0]);
        if(num %2 ==0 || num==0)
            System.out.println("even number");
        else System.out.println("odd number");
    }
}
