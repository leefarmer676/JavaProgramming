package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap();

        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("AJ", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //1. update the "M" to male and "F" to Female
/* 1st solution
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key, "Male");
            }
            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }
        System.out.println(employeeMap);

 */

        //second solution
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            System.out.println(entry);
            if(entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");//can set a value, but not a key bc keys cannot be changed
                //employeeMap.replace(entry.getKey(), "Male");
            }
            if(entry.getValue().equalsIgnoreCase("f")){
                employeeMap.replace(entry.getKey(), "Female");
            }
        }
        System.out.println(employeeMap);

        System.out.println("----------------------------");

        //display the names of all female employees

        for (Map.Entry<String, String> entries : employeeMap.entrySet()) {
            if(entries.getValue().equalsIgnoreCase("female")){
                System.out.println(entries.getKey());
            }
        }

    }
}
