package ex7_for_loop;

public class Lab037_for_if {
    public static void main(String[] args)
    {
        for(int age=13;age<=18;age++) {
            if (age > 16) {
                System.out.println("divya gets gift");
                //break; if we give break it will comeout from for loop
                // no gift
                // no gift
                // no gift
                // no gift
                // divya gets gift
                //end
            }
            else System.out.println("no gift");
            if(age==18)
                System.out.println("divya can vote");
        }
        System.out.println("end");
    }

}
