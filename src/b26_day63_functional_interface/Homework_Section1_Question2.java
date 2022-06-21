package b26_day63_functional_interface;
/*
1.2 Create a function that can return the minimum number
from a list of Integer
 */
public class Homework_Section1_Question2 {
    ListFunction<Integer,Integer> returnMinNumFromList = (num) -> {
        int min = num.get(0);
        for (int each : num) {
            if(each<min){
                min = each;
            }
        }
        return min;
    };
}
