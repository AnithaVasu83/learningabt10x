package ex5_if_else;

public class Lab023_ifelse {
    public static void main(String[] args) {
        int a=10;
        if(a==4) {
            System.out.println("hi");
        }
        else
        {
            System.out.println("hello");
        }
        boolean b=!true;
                if(b)
                    System.out.println("value is true");
                else
                    System.out.println("value is false");
                //this is the output because if statement will be excuted only in the true case
        if(b == false)
            System.out.println("value is true");
        else
            System.out.println("value is false");
        boolean b1=true;
        if(b1)
            System.out.println("value is true");
        else
            System.out.println("value is false");
    }
}
