package b26_day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/*
Use ListFunction functional interface to:
1.1 Create a function that can return the maximum number
from a list of Integer
 */
public class Homework_Section1_Question1 {
    public static void main(String[] args) {
        ListFunction<Integer, Integer> returnMaxNumberFromList = (t) -> {
            int max = t.get(0);
            for (int each : t) {
                if(each>max) {
                    max = each;
                }
            }
            return max;
        };

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(90, 20, 10));

        System.out.println(returnMaxNumberFromList.apply(list));
    }
    }

