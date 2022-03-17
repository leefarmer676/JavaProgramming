package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
        //who has the maximum salary

        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue()>maxSalary){
                maxSalary = eachEntry.getValue();
                name1 = eachEntry.getKey(); //String eachKey = eachEntry.getKey(); so  you can re-use the variable
            }

            if(eachEntry.getValue()<minSalary){
                minSalary = eachEntry.getValue();
                name2 = eachEntry.getKey();
            }
        }
        System.out.println(name1);

        //1.3 how many employees has the salary between 120k ~ 150K?
        int count = 0;

        for (Integer eachValue : map.values()) {
            if(eachValue>=120000 && eachValue<=150000){
                count++;
            }
        }
        System.out.println(count);

        //1.4 display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if(pairs.getValue()<118000){
                System.out.println(pairs.getKey());
            }
        }

        //Increase the salary employee by 10k if the current slaary of employee is less than 120k
        System.out.println("----------------------");
        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            int eachSalary = eachPair.getValue();
            if(eachSalary<120000){
                eachPair.setValue(eachSalary+10000);
            }
        }
        System.out.println(map);



        /*Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K



2. Wirte a program that can return the freuqency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}

         */

    }
}
