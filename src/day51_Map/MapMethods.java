package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        //student name and score of student

        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        students.put("Ali", 97);
        students.put("Ali", 87);


        System.out.println(students);
        System.out.println(students.size());
        //Map size is dynamic

        //display the score of Alex
        System.out.println(students.get("Alex"));

        //replace Ali' score to 90
        students.replace("Ali", 90);

        System.out.println(students);

        students.remove("Alex");

        System.out.println(students.size());

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);//false
        System.out.println(r2);//true

        boolean r3 = students.containsValue(100); //false

        System.out.println(students.isEmpty()); //false unless there are no keys and values left

        //compare 2 maps whtout worrying about the memory location

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1==map2);//false bc it's 2 different objects

        System.out.println(map1.equals(map2));//true bc they have the same values and keys

        map1.clear();

        map2.clear();

        System.out.println("map2 = " + map2);//empty

        //create a map that contains group ID and names group members








    }
}
