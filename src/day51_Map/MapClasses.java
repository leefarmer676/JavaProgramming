package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
            //key    value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");


        System.out.println("hashMap = " + hashMap);
        System.out.println(hashMap.get(40));//asks for key value, not index number

        //preserves order, no duplicates
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        //will not accept null -> NullPointerException
        //will sort it in ascending order
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, null);

        System.out.println("treeMap = " + treeMap);

        Map<Integer, String> hashtable = new Hashtable<>();
        //is synchronized (thread-safe), so it's slower but safer if you need it that way
        //doesnt accept null; maintains random order
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");

        System.out.println("hashtable = " + hashtable);

    }
}
