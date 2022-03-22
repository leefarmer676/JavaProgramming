package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuiltInFunctionalInterface2 {
    public static void main(String[] args) {
        //create a function that can check if Integer is contained in an array of an integer; return boolean
        BiPredicate<Integer[],Integer> contains = (a,b) -> {
            boolean result = false;
            for (Integer each : a) {
                if(each == b){
                    result = true;
                    break;
                }
            }

            return result;
        };

        Integer []arr = {1,2,3,4,55,6,7,8,8};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);

        System.out.println("---------------------");

        //create a function that can check if 2 strings are anagram and returns boolean

        BiPredicate<String, String> isAnagram = (a, b) -> {
            String [] arr1 = a.split("");
            String [] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println("---------------------");
        //create a function that can print the given string for the given number of times
        BiConsumer <String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Hello", 3);

        System.out.println("--------------------------");

        //create a function that takes first and last names and returns the formatted full name
        //"JaVa", "PROGramming" --> Java Programming

        BiConsumer<String, String> firstAndLastName = (a, b) -> {
            String firstName = a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase();
            String lastName = b.substring(0,1).toUpperCase() + b.substring(1).toLowerCase();
            System.out.println(firstName + " " + lastName);
        };

        firstAndLastName.accept("jAvA", "PROGRAMMING");

        System.out.println("---------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        scrumTeam1.forEach( (k,v) -> {
            System.out.println(k+ ":" +v);
        } );

        /*
        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton","SDET");
        scrumTeam2.put("Muhammed","Developer");
        scrumTeam2.put("Gulistan","Developer");
        scrumTeam2.put("Ahmad","PO");
        scrumTeam2.put("Nevim","SM");
        scrumTeam2.put("Atakan","SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur","SDET");
        scrumTeam4.put("Farya","Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David","Sdet");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza","SDET");
        scrumTeam5.put("Mehmet","Developer");
        scrumTeam5.put("Stefan","Developer");
        scrumTeam5.put("Rishat","PO");
        scrumTeam5.put("Ismail","SM");
        scrumTeam5.put("Tamara","SDET");
        scrumTeam5.put("Adnan","QA");

         */

        System.out.println("----------------------------");

        //create a function tha takes 2 integers and returns the max integer
        BiFunction<Integer, Integer, Integer> maxInteger = (a, b) -> {
            return a>b?a:b;
        };
        int max = maxInteger.apply(100, 200);
        System.out.println(max);

        //create a function that can merge two integer arrays into a list
        BiFunction<int[],int[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : x) {
                result.add(each);
            }
            for (int each1 : y) {
                result.add(each1);
            }
            return result;
        };
        int[]arr1 = {1,23,4,5,6};
        int[]arr2 = {34848593, 92, 9,9 };

        List<Integer> nums = merge.apply(arr1, arr2);

        System.out.println(nums);

        System.out.println("-----------------------");

        //create a function that takes a list of String and a list of Integer
        //combine students' names and scores into a Map

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> mergeStudentNameScore = (a, b) -> {
            Map<String, Integer> result2 = new HashMap<>();
            for (int i = 0; i < a.size(); i++) {
                result2.put(a.get(i), b.get(i));
            }
            return result2;
        };

        List <String> names = new ArrayList<>(Arrays.asList("Layan", "Ksenni:", "Aygun"));
        List <Integer> scores = new ArrayList<>(Arrays.asList(100, 100, 300));

        Map<String, Integer> students = mergeStudentNameScore.apply(names, scores);
        System.out.println(students);
        //{"Josh", "Daniel"}
        //{100, 110}


    }
}
