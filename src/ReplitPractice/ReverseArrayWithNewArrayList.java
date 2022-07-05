package ReplitPractice;

import java.util.ArrayList;

public class ReverseArrayWithNewArrayList {
    public static void main(String[] args) {
        int[]nums = {1,2,33,4,55,6,7};
        ArrayList<Integer> newList = new ArrayList<>();
        for (int each : nums) {
            newList.add(each);
        }
        //System.out.println("newList = " + newList);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = newList.size()-1; i >= 0; i--) {
            temp.add(newList.get(i));
        }
        System.out.println("temp = " + temp);
    }
}
