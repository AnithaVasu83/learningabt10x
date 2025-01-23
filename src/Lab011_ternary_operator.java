public class Lab011_ternary_operator {
    public static void main(String[] args)
    {
        //find the largest number
        int a=80,b=70,c=90;
        int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("largest number :" +result);


    }
}
