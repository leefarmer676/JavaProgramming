package b26_day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.3 Create a function that can return the longest String
from a List of String
 */
public class Homework_Section1_Question3 {
    public static void main(String[] args) {


        ListFunction<String, String> longestString = (list) -> {
            String str = "";
            //int countLength = 0;
            //List<String> list = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).length()>str.length()){
                    str = String.valueOf(list.get(i));
                }
            }
            return str;

        };
        List<String> pleaseWork = new ArrayList<>(Arrays.asList("Hello", "Please", "Help", "I", "Hate", "Java"));
        System.out.println(longestString.apply(pleaseWork));
    }
}