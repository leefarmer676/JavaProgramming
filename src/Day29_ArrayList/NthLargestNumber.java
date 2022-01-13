package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 3;
        for (int i = 1; i < n; i++) {//start i at 1 instead of 0 to be n-1
            list.removeIf(p -> Collections.max(list) == p);//removes the first maximum number

        }

        int max = Collections.max(list); //returns max number from the list

        System.out.println(max);

    }
}
