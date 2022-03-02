package day49_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);
        System.out.println(list.get(4));

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90, null));
        System.out.println(hashSet);
       // System.out.println(hashSet.get(4)); cannot use index number to get item bc it's random

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 10, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90, null));

        System.out.println(linkedHashSet);

        Set <Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 200, 10, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));//try to add null - give nullPointerException



    }
}
