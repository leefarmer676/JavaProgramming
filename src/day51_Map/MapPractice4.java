package day51_Map;

import java.util.*;

public class MapPractice4 {
    public static void main(String[] args) {
/*
        String[] group1 = {"Duygu", "Magda", "Farangez", "Edison", "Kerme", "Farngis"};
        String[] group2 = {"Marige", "Veslee", "Iryne", "Nilafar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamet"};
        String[] group9 = {"Alex", "Ali", "Andiry", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "muharret"};
        String[] group24 = {"Maria", "Kristin", "Amin", "George", "Layan", "Amin", "Yulia", "George", "ayanle", "Maxim", "Nermin", "doug"};
        String[] group5 = {"Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"};


 */
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison", "Kerme", "Farngis"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Marige", "Veslee", "Iryne", "Nilafar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamet"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex", "Ali", "Andiry", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "muharret"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria", "Kristin", "Amin", "George", "Layan", "Amin", "Yulia", "George", "ayanle", "Maxim", "Nermin", "doug"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"));

        //create map where you can store a group ID and students
        Map<Integer, ArrayList<String>> groups = new TreeMap<>();

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

        System.out.println(groups); //printed in sorted order because we used TreeMap - sorts by keys

        for (String each : groups.get(9)) { //groups.get(9) then apply for each loop to get each value from key
            System.out.println(each); //will print students names from group 9

        }

        //how to print specific names from this

        System.out.println(groups.get(2).get(3)); //first number returns the arrayList, second is the index number
        //of specific name within the array list - can call charAt method from this as well

        //prints each name from each list
        for (ArrayList<String> eachGroup : groups.values()) {
            for(String eachName : eachGroup){
                System.out.println(eachName);
            }
        }

    }
}
