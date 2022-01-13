package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String [] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //converting array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        //can call asList bc it's a primitive array

        list.removeIf(p -> p.length()>=10);

        //convert arrayList back to array
        countries = list.toArray(new String[0]);//0 will be replaced by the size of the list

        System.out.println(Arrays.toString(countries));

        /*
        1. create an array of string called countries

        2. write a program that can remove all country names that have length of 10 or greater
         */


    }
}
