package ex7_for_loop;

public class Lab039_for_if_break {
    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}

//output if we give break it will come out of the for loop.wont go to updtion phrase
//0
//1
// 2
// 3
// 4
