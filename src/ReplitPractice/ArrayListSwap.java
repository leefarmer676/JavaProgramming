package ReplitPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSwap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        ArrayList<String> swappedList = new ArrayList<>();
        swappedList.addAll(list);
        for (int i = 0; i < swappedList.size(); i++) {
                String temp = null; //element at pos1 "one"
                String tempx = null; //element at pos2 "three"
                if (i == pos1) {
                    temp = swappedList.get(pos1);
                    swappedList.set(pos2, temp); //"one", "two", "one"
                } else if (i == pos2) { //"one"
                    tempx = swappedList.get(pos2); //"one"
                    swappedList.set(pos1, tempx); //"one", "two", "one"
                }
            }
        return swappedList;
    }

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>(Arrays.asList("one", "two", "three"));
        swap(test, 0, 2);
        System.out.println("test = " + test);
    }
}
