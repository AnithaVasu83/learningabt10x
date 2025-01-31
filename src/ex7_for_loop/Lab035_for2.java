package ex7_for_loop;

public class Lab035_for2 {
    public static void main(String[] args)
    {

        //for(int i=0;;i++) this will run infinity till you press red button
        //for(;i>=10;i++) this will show error since i value is not initialized
        //for(int i=0;i<=10; ) infinity
        //for(int i=0;;) infinity
        for(;;) //infinity till you kill
        {
            System.out.println("Hello");
            //  exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
            // exit code 0 - Successful
        }

    }
}
