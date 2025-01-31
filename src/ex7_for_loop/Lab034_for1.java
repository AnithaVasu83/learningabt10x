package ex7_for_loop;

public class Lab034_for1 {
    public static void main(String[] args)
    {
        //Initialization, condition, updation(incre/decre) ICU
        for(int i=0;i <=10;i++)
        {
            System.out.println(i);//run 11 times print 0 to 10
        }
        int x;
        for(x=1;x<=10;x++)
        {
            System.out.println(x);
        }
        int y=1;
        for(;y<=3;y++)
        {
            System.out.println(y);
        }
        //for(int i=1; i <=1;) //infinity
        for(int i=0;i>=0; )
        {
            System.out.println(i);
            i--;
        }


    }
}
