import java.io.PrintStream;

public class Lab003_types_of_print {
    public static void main (String[] args) {
        //print- prints the message and doesnt move the cursor to the next line
        /**
         * println-prints the message and moves the cursor to the next line
         * it doesnt support comma, formatting only +
         */
         // printf - supports formatting ,
        int age=35;

        System.out.println("my age is: " + age);
        System.out.print("hello");
        System.out.println();
        System.out.printf("my age is: %d", age);
    }
}
