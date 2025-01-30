package ex6_switch;

public class Lab029_switch_number {
    public static void main(String[] args)
    {
       int num=Integer.parseInt(args[0]);
       switch (num)
       {
           case 1:
               System.out.println(num);
               break;//if no break it will next cases and default.break is must
           case 2:
               System.out.println(num);
               break;
           case 3:
               System.out.println("hello");
               break;
           default:
               System.out.println("default");
               break;

       }
       System.out.println("no default");
    }

}
