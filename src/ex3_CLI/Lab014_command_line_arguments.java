package ex3_CLI;

public class Lab014_command_line_arguments {
    public static void main(String[] args) {
        String string_num1=args[0];
        int num1=Integer.parseInt(string_num1);
        System.out.println(string_num1);
        String string_num2=args[1];
        int num2=Integer.parseInt(string_num2);
        System.out.println(num1 > num2);
        int num3=(num1 > num2)? num1 : num2;
        System.out.println("Greatest number :" +num3);

    }
}
