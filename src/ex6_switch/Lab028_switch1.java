package ex6_switch;

public class Lab028_switch1 {
    public static void main(String[] args) {
        char ch=args[0].charAt(0);
        // char ch=args[0]; is wrong
        switch (ch) {
            case 'A':
                System.out.println(ch);
                break;
            case 'B':
                System.out.println(ch);
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
