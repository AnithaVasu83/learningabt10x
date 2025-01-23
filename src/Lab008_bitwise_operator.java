public class Lab008_bitwise_operator {
    public static void main(String[] args)
    {

        int a=-5;
        int b=6;

        int c=(a | b);
        System.out.println("bitwise OR: "+c);
        //boolean f=false;
        //System.out.printf("bitwise OR:%b ",(a | f)); shows error
        int c1=(a & b);
        System.out.println("bitwise AND: "+c1);
        int c2=(a ^ b);
        System.out.println("bitwise XOR: "+c2);
        int c3= ~b; //unary operator
        System.out.println("bitwise complement (~): "+c3);
        int a1=4;
        int b1=2;
        System.out.println("bitwise signed left shift(<<): "+ (a1 << b1));
        System.out.println("bitwise signed right shift(>>): "+ (a1 >> b1));
        System.out.println("bitwise unsigned right shift(>>>): "+ (a1 >>> b1));





    }
}
