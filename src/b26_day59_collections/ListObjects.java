package b26_day59_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //reference of the interface List because it's implemented in ArrayList
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null); //allows null objects
        list.add("a"); //ArrayList allows duplicates
        System.out.println(list);
        System.out.println(list.get(3)); //benefits of ArrayList - can access the elements quickly
        //because it uses array internally

        List<String> list1 = new LinkedList<>();
        //reference of the interface list, but the object is LinkedList object
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add(null); //allows null objects
        list1.add("a"); //ArrayList allows duplicates
        System.out.println(list);
        System.out.println(list.get(3));


        List<String> list2 = new Vector<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null); //allows null objects
        list2.add("a"); //allows duplicates
        System.out.println(list);
        System.out.println(list.get(3));
        //what is different about Vector? -

    }
}
