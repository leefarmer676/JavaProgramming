package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
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

        System.out.println("--------------------------");

        Consumer<String> printEach = (s) -> {
            //doesn't have to have a return bc return type is void
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Java");

        System.out.println("--------------");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (Integer each : list1) {
            list1.forEach(p -> System.out.println(p)); //could use curly braces to give condition - see below
            list1.forEach(p->{if(p%2!=0) System.out.println(p);});
            /*if(each%2!=0){
                System.out.println(each);
            }

             */

            System.out.println("------------------------");

            List <String> employees = new ArrayList<>();
            employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Jarullah", "Jilii Jiwi", "Ali Ismay"));

            employees.forEach( s -> {
                System.out.println(s.charAt(0)+ "." + s.charAt(s.lastIndexOf(" ")+1));
            } );
        }
        System.out.println("---------------------------");

        Function <int[], List<Integer>> convertToList =
                (a) -> {
            List <Integer> result = new ArrayList<>();
                    for (int each : a) {
                        result.add(each);
                    }
                    return result;
            };
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("-------------------------------");

        Function<List <Integer>, int[]> convertToArray = (a) -> {
            int[] result2 = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result2[i]= a.get(i);
            }
            return result2;
        };
        List <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] array2 = convertToArray.apply(numbers);
        System.out.println(Arrays.toString(array2));

        System.out.println("--------------------------");
//***************TODO*************
        //create a function that can return the max number from int array
        //create a function that can swap the first and last elements of an array
        //create a function that can reverse and array and returns it
        //create a function that can reverse a list
     }
}
