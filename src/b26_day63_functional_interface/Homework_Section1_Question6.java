package b26_day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.6 Create a function that can convert List of double to
double array
 */
public class Homework_Section1_Question6 {
    public static void main(String[] args) {
        ListFunction<Double, Double[]> convertListToArrayDouble = (list) -> {
            Double [] array = new Double[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        };

        List<Double> list1 = new ArrayList<>(Arrays.asList(1.0, 3.9, 6.4, 7.3, 22.3));
        System.out.println(Arrays.asList(convertListToArrayDouble.apply(list1)));
    }
}
