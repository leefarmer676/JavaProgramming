package ReplitPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTimesTwo {
    
    public static ArrayList<Integer> timesTwo (ArrayList<Integer> nums) {

        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int temp = nums.get(i) * 2;
            newList.add(i, temp);

        }

        return newList;
    }
    
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(timesTwo(list));

    }
}

