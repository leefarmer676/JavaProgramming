package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        //Integer[] array = set.toArray(new Integer[0]);
        //System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

        //null means no object is actually created
        //try to print out size --> nullPointerException
        List <String> names = null;
    }
}
