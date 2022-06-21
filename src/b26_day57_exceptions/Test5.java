package b26_day57_exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test5 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");
        map1.put(4, "d");
        for (Integer key : map1.keySet()){
            if(key%2==0){
                System.out.println(map1.get(key));
            }
        }
    }
}
