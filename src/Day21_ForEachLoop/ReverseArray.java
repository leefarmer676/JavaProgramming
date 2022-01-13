package Day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40};

        int [] reversed = new int [numbers.length];  //result = 50,40,30,20,10 //to make sure array has enough capactiy to contain all the elements of the first array

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        /*
                 j            i
        reversed[0] = numbers [numbers.length-1];
        reversed[1] = numbers [2];
        reversed[2] = numbers [1];
        reversed[3] = numbers [0];


 */
        System.out.println(Arrays.toString(reversed));

    }
}
