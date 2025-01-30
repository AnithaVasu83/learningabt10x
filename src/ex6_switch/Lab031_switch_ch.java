package ex6_switch;

public class Lab031_switch_ch {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println(ch);
                break;
            default:
                System.out.println("not A");
                break;
        }
        switch (ch) {
            case 65:
                System.out.println(ch);
                break;
            default:
                System.out.println("not A");
                break;
        }
    }
}
