package ex6_switch;

public class Lab031_switch_ch {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        switch (ch) {
            case 'A','B'://modern switch
                System.out.println(ch);
                break;
            default:
                System.out.println("not A");
                break;
        }
        switch (ch) {
            case 65:
            case 66:
            case 67:
                System.out.println(ch);//traditional switch
                break;
            default:
                System.out.println("not A,B,C");
                break;
        }
    }
}
