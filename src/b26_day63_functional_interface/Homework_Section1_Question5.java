package b26_day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.5 Create a function that can convert List of integer to
int array
 */
public class Homework_Section1_Question5 {
    public static void main(String[] args) {
        ListFunction<Integer, int[]> convertListToArray = (list) -> {
            int[]array = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        };
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,6,8,3,2));
        int[] arr1 = convertListToArray.apply(list1);
        System.out.println(Arrays.toString(arr1));
    }
}
