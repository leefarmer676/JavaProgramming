package day53_FunctionalInterface;

import java.util.Arrays;
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
    }
}
