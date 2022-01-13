package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);//ascending order

        System.out.println(list);

        System.out.println("----------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E', 'B'));

        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);//reverse order or list 2

        System.out.println("-----------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        //swap 5th element with the second element

        Collections.swap(list3, 1, 4);//arraylist, first index, second index
        System.out.println(list3);

        System.out.println("-----------------");

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4, 10, 1000);
        System.out.println(list4);

        System.out.println("-------------------");

        int freq = Collections.frequency(list4, 1000);
        System.out.println("freq = " + freq);

        System.out.println("---------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int frequency = Collections.frequency(words, "Java");
        int frequency2 = Collections.frequency(words, "Python");
        if(frequency2==frequency){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

    }
}
