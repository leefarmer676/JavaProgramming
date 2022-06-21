package b26_day64_functionalInterface_lambdaExpression;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        //compare two numbers, find biggest one
        //first 2 types are your parameter types and last one is return type
        BiFunction<Integer, Integer, Integer> maxNumber = (one, two) -> {
          return one > two ? one : two;
        };

        System.out.println(maxNumber.apply(5,2));
        System.out.println();

        BiFunction< List<Integer>, List<String>, Map<Integer, String> > createMap = (keys, value) -> {
            Map<Integer, String> map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), value.get(i));
            }
            return map;
        };

        List<Integer> keys = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<String> values = new ArrayList<>(Arrays.asList("James", "ana", "Emre", "gina"));

        System.out.println("createMap.apply(keys, values) = " + createMap.apply(keys, values));
        /*
        List<Integer> -- keys -- first param
        List<String> -- values -- second param
        Map<Integer, String> -- return -- final map that will be returned
         */
    }
}
