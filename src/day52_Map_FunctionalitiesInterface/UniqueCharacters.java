package day52_Map_FunctionalitiesInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            if(frequency == 1){
                result.put(each, 1); //under this condition the freq of the character is always 1
                //could use variable frequency instead of the number 1
            }
        }



    }
}
