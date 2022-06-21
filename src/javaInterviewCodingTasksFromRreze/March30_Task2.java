package javaInterviewCodingTasksFromRreze;

import java.util.Arrays;

public class March30_Task2 {
    public static int[] sortArrayAscending(int[]array){
        //int[] arr = {10,2,3,3,5,2,4};
        for (int each : array) {
            int min = Integer.MAX_VALUE;
            if(each<min){
                min = each;
                for (int i = 0; i < array.length; i++) {
                    //add each to new array?;
;                }
            }
        }
        return array;
    }
    /*
    2.Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort
method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);         ==>{ 7, 8, 9, 10};
3.Array -- Sort Descending
Write a return method that can sort an int array in descending order without using the
sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */
}
