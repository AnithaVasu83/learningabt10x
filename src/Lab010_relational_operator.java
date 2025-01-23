import java.sql.SQLOutput;

public class Lab010_relational_operator {
    public static void main(String[] args)
    {
        int a=10,b=15;
        System.out.println("equal to: " + (a==b));
        //int c=a<b; , shows error only boolean
        boolean c=a<b;
        System.out.println("lesser than: " + c);
        System.out.println("greater than: " + (a>b));
        System.out.println("lesser than and equal to: " + (a<=b));
        System.out.println("greater than and equal to: " + (a>=b));

    }
}
