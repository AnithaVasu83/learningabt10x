public class Lab009_logical_operator {
    public static void main(String[] args)


    {
        boolean a=true;
        boolean b=false;
        boolean c=a||b;
        boolean d=a&&b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(!a);
        //boolean e=a|b; bitwise operator mostly used on intergers
        //boolean f=a&b;
        //System.out.println(e);
        //System.out.println(f);
        int a1=5,b1=10,d1=20;
        boolean c1=(a1>=b1) || (b1<=d1);
        System.out.println("logical OR: " +c1);
        boolean c2=(a1>=b1) && (b1<=20);
        System.out.println("logical AND: "+c2);
        System.out.printf("logical NOT: %b",!(a1>b1));





    }
}
