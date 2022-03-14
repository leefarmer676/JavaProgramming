package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        //remove all elements that are less than 4

        //this will skip some items bc arrayList is dynamic.
        //once it is removed, numbers will shift index #s, so it will go to the next i, but the
        //number that was shifted left will never be checked with if condition
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()) {
            if (it.next() < 4) {
                it.remove();
            }
        }

        System.out.println(list2);
/*
        boolean r1 = it.hasNext(); //returns boolean

        System.out.println(r1); //true bc there is an element in the list currently

        System.out.println(it.next()); //this will get you the next method in the iteration, 1

        boolean r2 = it.hasNext();

        System.out.println(r2); //true

        System.out.println(it.next());//2

 */
        System.out.println("-------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) { //don't need to increment or decrement
            //bc hasNext method will stop on its own; we don't need to increment to make it false at some point
            if (i.next() < 4) {
                i.remove();
            }

        }
        System.out.println(list3);
        System.out.println("----------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        list4.removeIf(each -> each < 4);

        System.out.println(list4);

    }
}
