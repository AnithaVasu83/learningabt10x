package ex7_for_loop;

public class Lab040_for_continue {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            if(i==5) {
                System.out.println("type this then go to increment");
                continue; //cant use continue or break keyword in if- else statement
                // but can use these keywords when if- else or if statement comes within for loop
            }

                System.out.println(i);
                //break; output will be 0

        }
    }
}
