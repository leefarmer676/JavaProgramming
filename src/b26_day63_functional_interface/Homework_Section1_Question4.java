package b26_day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.4 Create a function that can return the shortest String
from a List of String
 */
public class Homework_Section1_Question4 {
    public static void main(String[] args) {
    ListFunction<String, String> shortestString = (list) -> {
        String str = list.get(0);
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).length()<str.length()){
                str = list.get(i);
            }
        }
        return str;
    };
        List<String> gettingIt = new ArrayList<>(Arrays.asList("Getting", "A", "Little", "Easier"));
        System.out.println(shortestString.apply(gettingIt));

    }
}
