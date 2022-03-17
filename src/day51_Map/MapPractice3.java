package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 145000);
        map.put("Antony", 100000);
        map.put("Jimmy", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 145000);
        map.put("Steven", 135000);

        //display the names of all employees who have maximum salary
        int maxSalary = Integer.MIN_VALUE;

        for( Integer eachValue : map.values() ){
            if(eachValue > maxSalary){
                maxSalary = eachValue;
            }
        }

       // int maxSalary = Collections.max( map.values() ); - if you can use the Collections, then this is all you
        //need to find the max value of a Collection
        System.out.println(maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == (maxSalary)){
                System.out.println(pair.getKey());
            }
        }

    }
}
