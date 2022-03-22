package day52_Map_FunctionalitiesInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(11, "SDET");
        map1.put(12, "SM");
        map1.put(13, "BA");
        map1.put(14, "Developer");
        map1.put(15, "PO");

        Map<String, Integer>  map2 = new LinkedHashMap<>();
        map2.put("Shay", 100000);
        map2.put("JHulya", 110000);
        map2.put("Veronica", 1150000);
        map2.put("Ali", 150000);
        map2.put("Alex", 160000);

        Map <Map <Integer,String>, Map<String,Integer> > mapOfMap = new LinkedHashMap<>();
        mapOfMap.put(map1, map2);

        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapOfMap.entrySet()) { //mapofMap.entrySet().for
            for (Map.Entry<Integer, String> entry : mapMapEntry.getKey().entrySet()) { //mapMapEntry.getkey().setEntry().for
                System.out.println(entry.getValue()); //displays all the job titles
            }

            for (Map.Entry<String, Integer> entry : mapMapEntry.getValue().entrySet()) { //mapMapEntry.getValue().entrySet().for
                System.out.println(entry.getKey());
            }
        }

        System.out.println("--------------------------");

        //print "veronica"
        //how to get a value from a map of map
        System.out.println(mapOfMap.get(map1).get("Veronica")); //returns Veronica's salary



        /*
        id, job title, name, salary
         */

    }
}
