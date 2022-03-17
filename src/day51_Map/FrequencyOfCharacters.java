package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //               bca
        //               235
        //Collections.frequency() - must convert String to collection type

        String [] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) { //each: characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr), each) );

        }
        System.out.println(result);


        //write a program that can return teh frequency of characters
        //Must use Map
        //str = "bbcccaaaaa
        //output: {b=2, c=3, a=5}

    }
}
