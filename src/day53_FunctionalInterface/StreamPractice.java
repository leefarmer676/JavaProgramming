package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,3,2,1,8));
        list = list.stream().distinct().collect(Collectors.toList());
        //distinct excludes the duplicates, but stream cannot change the data structure
        //
        //stream method gets every element of the list
        System.out.println(list);

        int[]arr1 = {1,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,3,2,1,8));
        list2 = list2.stream().skip(5).collect(Collectors.toList()); //skips the first n elements
        System.out.println(list2);

        int[]nums2 = {1,2,3,4,5,5,6,6,7,8,8};
        nums2 = Arrays.stream(nums2).skip(4).toArray();
        System.out.println(Arrays.toString(nums2));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,3,2,1,8));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());
        //limits size to 7 - anything after this will be removed
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,3,2,1,8));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());
        System.out.println(list4);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Saturday", "Sunday"));

        days = days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());

        System.out.println(days);

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,3,2,1,8));
        List <Integer> evens = list5.stream().filter(p-> p%2==0).collect(Collectors.toList());

        System.out.println(evens);

        System.out.println("------------------------------");

        //usually count is used with filter method - you can count how many are matching

        //how many
        List<String> list6 = new ArrayList<>(Arrays.asList("java", "Java", "jAvA", "Python", "Ruby"));
        long countJava = list6.stream().filter(p->p.equalsIgnoreCase("java")).count();
        System.out.println(countJava);

        list6.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));
        //above printed each match for "java"

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,3,2,1,8));
        //checks if all are matching with condition given; returns boolean
        boolean r1 = list7.stream().allMatch(p->p%2==0); //false since there are odd numbers too
        System.out.println(r1);

        //anyMatch() will return true if one or more is matching
        boolean r2 = list7.stream().anyMatch(p->p>20); //false
        System.out.println(r2);

        //noMatch()
        boolean r3 = list7.stream().noneMatch(p->p%3==0);
        System.out.println(r3);
    }
}
