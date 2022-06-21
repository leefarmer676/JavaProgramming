package b26_day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {


        Function<int[], List<Integer>> convertArrayToList = (nums) -> {
            List<Integer> list = new ArrayList<>();
            for( int each : nums){
                list.add(each);
            }
            return list;
        };//<T,R>

        int [] a = {32, 4, 23, 5};

        List<Integer> list = convertArrayToList.apply(a);
        System.out.println(list);


    }
}
