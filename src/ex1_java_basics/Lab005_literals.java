package ex1_java_basics;

public class Lab005_literals {

    public static void main(String[] args)
    {
        //char a=''; no empty char string
        //char c='an'; wont work
        boolean b=true;

        char new_line='\n';
        char back_space='\b';
        char tab='\t';
        char carriage_return='\r';
        char new1='n';
        char back1='b';
        int hexdecimal1=0x123;
        int Octdec=0567;
        int bindec=0b010;
        char backslash='\\';
        System.out.println("ex1_java_basics.Hello"+new_line+"java");
        System.out.printf("ex1_java_basics.Hello %b java\n",true);
        System.out.printf("ex1_java_basics.Hello %s java\t",true);
        System.out.println("ex1_java_basics.Hello \n java");
        System.out.println("ex1_java_basics.Hello\b java");
        System.out.println("ex1_java_basics.Hello " +carriage_return + "java");
        System.out.println("ex1_java_basics.Hello"+new1+"java");
        System.out.println("ex1_java_basics.Hello"+back1+"java");
        System.out.println("decimal value of hexadecimal:"+hexdecimal1);
        System.out.println("decimal value of octal:"+Octdec);
        System.out.println("decimal value of binary:"+bindec);
        System.out.println("ex1_java_basics.Hello"+backslash+"java");

        int a1=10,b1=20;
        int x,y;
        float z;
        x=y=20;
        z=20;
        System.out.printf("%d %d %f\n",x,y,z );

        System.out.println(a1+b1);




    }
}
