public class Lab007_unary_operator {
    public static void main(String[] args)
    {
       int n1=3;
        System.out.println("unary plus\t" +n1);
        System.out.println("unary minus\t" + -n1);
        // incase of numeric + will perform addition
        long a=956786893l;
        int b=10;
        System.out.println(a + b);
        // incase of string + will perform concatenation
        String s1="Arathana";
        String s2="vijay";
        System.out.println(s1 + "\n" + s2);
        System.out.println(s1 + "\t" + s2 + "\t" + a + b);
        System.out.println(a + b + "\t" + s1 + "\t" + s2);
        System.out.println(s1 + "\n" + s2 + "\t" + (a + b));
        // logical not operator !
        boolean b1=true;
        System.out.println(!b1);
        // bitwise ~
        int c=-5;
        System.out.println("c=\t" + c);
        System.out.println("bitwise c :\t" + ~c);
        char c1=' ';
        System.out.println("space"+c1+"not visible");




    }

}
