package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println(numbers);

        System.out.println("---------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        int size2 = list.size();
        int numberOfZeros = size-size2;

        System.out.println("numberOfZeros = " + numberOfZeros);

        for (int i = 0; i < numberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("-----------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
           if(each != 0){
               result.add(each);
           }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("--------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);//add all characters

        System.out.println("letters = " + letters);

        letters.removeIf(p -> !Character.isLetter(p));//remove the characters that are not letters

        System.out.println("letters = " + letters);

        //for special characters either remove all digits and remove all letters or remove if Character.isLetterorDigit





    }
}
