//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lab004_constant_variable {
    static int e = 5;
    public static void main(String[] args) {
        // you cannot change the value when it is initialized as final
        final int a = 101;
        // int b2 = ++a or b2 = a++ is invalid bcoz a is final variable
        int b2 = 10;
        b2 += a;
        byte b = 10;
        short s = 10;
        long l = 9876543210l;
        float f = 3.14f;
        double d = 67.8987654567;
        boolean b1 = true;
        char c = 'A';
        //char c1 = "A"; is not valid.it becomes string with double quote

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b1);
        System.out.println(c);
        System.out.println(e);


    }
}