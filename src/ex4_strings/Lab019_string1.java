package ex4_strings;

public class Lab019_string1 {
    public static void main(String args[])
    {
        String s1="Hello";
        s1="world";
        System.out.println("to check the change: " + s1);
        // even though s1 value is changed "ex1_java_basics.Hello" will be in string constant pool till JVM terminates because
        // strings in java are immutable
    }
}
