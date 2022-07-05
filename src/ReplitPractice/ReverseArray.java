package ReplitPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 33, 4, 55, 6, 7};
        int tempFirst;
        int tempSecond;
        for (int i = 0; i <= nums.length/2; i++) {
            tempFirst = nums[i];
            tempSecond = nums[6-i];
            nums[6-i] = tempFirst;
            nums[i] = tempSecond;
        }
        System.out.println(Arrays.toString(nums));
    }
}

/*
this works but doesn't use a loop
    int zeroIndex = nums [0];
    int firstIndex = nums [1];
    int secondIndex = nums [2];
    nums [0] = nums [6];
    nums [1] = nums [5];
    nums [2] = nums [4];
    nums [4] = secondIndex;
    nums [5] = firstIndex;
    nums [6] = zeroIndex;
    */
