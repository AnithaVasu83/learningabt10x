package task_9_feb;

import java.util.Arrays;

//Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32}
//Second smallest number  in any array.
public class Task_46_second_largest {
    public static void main(String[] args)
    {
        int[] numbers={12,34,10,1,100,3,4,32};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int second=numbers.length-2;
        System.out.println("Second Largest number: " +numbers[second]);
    }
}
