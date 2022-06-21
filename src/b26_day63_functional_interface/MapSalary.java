package b26_day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("James", 135000.0);
        map.put("Jane", 80000.0);
        map.put("Ana", 70000.0);
        map.put("Jorge", 60000.0);
        map.put("Elza", 40000.0);
        map.put("Peter", 117434.0);

        String name = "";
        double maxValue = 0.0;
        String nameForLowest = "";
        double minValue = Double.MAX_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > maxValue) {
                name = key;
                maxValue = map.get(key);
            }
            if (map.get(key) < minValue) {
                nameForLowest = key;
                minValue = map.get(key);
            }
        }
        System.out.println("maxValue = " + name + " has largest salary of: " + maxValue);
        System.out.println("minValue = " + minValue);


        System.out.println();

        int counter = 0;
        for (double value : map.values()) {
            if (value >= 120_000 && value <= 150_000) {
                counter++;
            }

        }
        System.out.println("number over 120k and less than 150k is: " + counter);

        System.out.println();
/*
        for (double value : map.values()) {
            if (value < 118_000) {
                System.out.println(map.get(value));
            }

        }

 */

        for(String name1 : map.keySet()){
            if(map.get(name1)<=218_000){
                System.out.println(name1);
            }
        }
        for(String key : map.keySet()){
            map.put(key, map.get(key)+10_000);
        }
        System.out.println(map);

    }
}
