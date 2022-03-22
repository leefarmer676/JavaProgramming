package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInFunctionalInterface1 {
    //Predicate Functional Interface - returns boolean - takes one argument of any type
    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);

        Predicate<Integer> isEven = p -> p%2==0;

        System.out.println("------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));
        list.removeIf(isEven); //isEven is a Predicate which is what removeIf calls for as argument
        System.out.println(list);

        System.out.println("-------------------------------");

        List <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);

        System.out.println(names);

    }
}
