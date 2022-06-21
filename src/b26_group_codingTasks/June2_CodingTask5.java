package b26_group_codingTasks;

import java.util.Arrays;

/*
5) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

 */
public class June2_CodingTask5 {

    public static int[] sortArrayAscending(int[]array){
        for (int i = 0; i < array.length-1; i++) {
            for (int each : array) {
                if(array[i]>each){
                    array[i+1]=each;
                }
            }
        }
        System.out.println("array = " + Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        int[]arr={10,9,8,7};
        sortArrayAscending(arr);
    }
}
