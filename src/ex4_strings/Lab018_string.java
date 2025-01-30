package ex4_strings;

public class Lab018_string {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Hello");
        String s3=s2.intern();
        String s5="hello";
        String s4=new String("Hello");
        System.out.println("string has the same memory address: " + (s1==s2));
        System.out.println("string has the same memory address: " + (s1==s3));
        System.out.println("string has the same memory address: " + (s4==s2));
        System.out.println("string has the same memory address: " + (s1==s5));
        System.out.println("string has same value: " + s1.equals(s2));
        System.out.println("string has same value: " + s1.equals(s3));
        System.out.println("string has same value: " + s2.equals(s4));
        System.out.println("string has same value: " + s2.equals(s5));
        System.out.println("string has same value: " + s2.equalsIgnoreCase(s5));

    }
}
