package ex2_operators;

public class Lab012_ternary2 {
    public static void main(String[] args)
    {
        //find even number
        int num=15;
        int num1 = 16;
        boolean result1=(num<=num1)? true:false;
        String result=(num%2==0)? "even" :"odd";
        System.out.println("given number is :" +result);
        System.out.println((result1));

    }
}
