package day49_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        String [] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon","Wooden Spoon","Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        //this way is much faster than the commented out way below
        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String [0]); //use LinkedHashSet if you want
        //the order to stay the same

        /*
        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(arr));

        System.out.println(set1);//prints out in random order - no duplicates

        //convert it back to the array without duplicates
        arr = set1.toArray(new String[0]);


         */
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 30, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);

        System.out.println("-----------------------------");

        Integer [] nums = {1,2,2,3,4,5,6,1,2,3,4,5};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[4]);

        System.out.println("---------------------");

        String str = "aaaabbbbccccdddddddeeeeeee";

        String result = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")), each);
            result += each+count;
        }
        System.out.println(result);


    }
}
