package day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 75);
        students.put("Serkan", 70);
        students.put("Andriy", 98);
        /*
        Set <String> keys = students.keySet(); //returns it as a Set bc it doesn't accept duplicates - keys are unique
        //now you can apply the loop to iterate the Set
        //iterated every key from the Map

        for(String eachKey: keys){
            //System.out.println(eachKey + " " + students.get(eachKey)); //get key and use the key
            //increase each student's score by 5
            students.replace(eachKey, students.get(eachKey) + 5);
        }

         */

        Map <String, Integer> earlyBirds = new HashMap<>();//score >= 90
        Map <String, Integer> angryBirds = new HashMap<>(); // score <90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

        Set <String> names = students.keySet();

        System.out.println("--------------------------");

        //just want to get the values, don't care about the names
        //Collection<Integer> scores = students.values();
        List<Integer> scores = new ArrayList<>( students.values() );
        //now that you have this list, you can iterate each one
        System.out.println(scores);

        for (Integer value : students.values()) {
            System.out.print(value + " ");

        }






        for(String eachKey : students.keySet()){
            Integer eachValue = students.get(eachKey);
            if(eachValue<90){
                System.out.println(eachKey);;
            }
        }

        System.out.println("-------------------------");

        //find max and min score
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        //iterate by values using values method
        for (Integer score : students.values()) {
            if(score>maxScore){
                maxScore = score;
            }

            if(score<minScore){
                minScore = score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("-----------------------");

        //if you can use the Collections type, then you can do it this way without a loop
        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-----------------------------------");

        //write program that can count how many students have a score of 95 or greater
/*
        int count = 0;

        for (Integer eachScore : students.values()) {
            if(eachScore>=95){
                count++;
            }
        }
        System.out.println(count);

 */
        int count = 0;
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore>= 95){
                count ++;
            }
        }

        System.out.println("--------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry); //this prints every key and value
            System.out.println(entry.getKey()); //this prints all the names only
            System.out.println(entry.getValue()); //this prints you all the scores
        }


    }


}
