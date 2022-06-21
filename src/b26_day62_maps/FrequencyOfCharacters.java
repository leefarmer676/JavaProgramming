package b26_day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void frequencyOfEachChar (String str){
        /*
        Map<String, Character> frequencyMap = new HashMap<>();

        frequencyMap.put("one", 'o');

        for(Map.Entry<String, Character> each : frequencyMap.entrySet() ){

        }
        */
        Map<Character, Integer> counter = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            //the first time you find the letter a, put a into your map
            if(counter.containsKey(key)){
                //if it already contains key, then we already did the else block - this is a duplicate char
                //so we need to update the counter, which is the value in the map
                //can use put method

                counter.put(key, counter.get(key) + 1); //counter.get is the current value of counter
                //then this assigned the result as the new value linked to that key

            }else{
                //the map does not contain the letter/char -> which means this is the first time
                //the character was found, so we should add it to the map
                //so the value is 1, because in this case, it's only the 1st time we've found it, so we start
                //at a count of 1

                counter.put(key, 1);
            }

        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        frequencyOfEachChar("banana");
    }
}
