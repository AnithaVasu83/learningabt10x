package ex7_for_loop;

public class Lab036_for_boolean {
    public static void main(String[] args) {
        boolean b = true;
        for (int i = 0; b; i++) {
            System.out.println(i);
            // infinity kill it
        }
    }
}
