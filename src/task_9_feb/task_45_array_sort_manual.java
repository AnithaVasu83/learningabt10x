package task_9_feb;
import java.util.*;
//Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
//
//1,3,4,10,12,32,34,100
//
//without using any functions.
//
//Hint - compare and replace(temp)

public class task_45_array_sort_manual {
    public static void main(String[] args)
    {
        int[] numbers={12,34,10,1,100,3,4,32};
        Arrays.sort(numbers);
        System.out.println("Sorted array: "+Arrays.toString(numbers));
        System.out.println("Sorted array: "+numbers);
        int[] num={12,34,10,1,100,3,4,32};
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length-i-1;j++)//'num.length-i-1' purpose is to avoid 'ArrayOutOfIndex' here we compare num[j+i]
                //and we no need to sort already sorted last element we can also use'num.length-1
            {
                if(num[j]>num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }


            }
        }
        System.out.println(Arrays.toString(num));
    }
}
