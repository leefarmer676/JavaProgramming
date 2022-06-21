package b26_day63_functional_interface;

import java.util.function.Predicate;

/*
Use Predicate Functional interface to:
1.1 Create a function that can verify if a number
contains duplicate digits
 */
public class Homework_Section2_Question1 {
    public static void main(String[] args) {


        Predicate<Integer> duplicateDigitsOrNot = (num) -> {
            String nu = num.toString();
            String newString = "";
            for (int i = 0; i < nu.length(); i++) {
                String [] array = new String[nu.length()];
                array[i] = String.valueOf(nu.charAt(i));
                for (int j = 1; j < array.length-1; j++) {
                    newString += array[0];
                    if(newString.contains(array[j])){
                        return true;
                    }else{
                        newString += array[j];
                    }
                }
            }
            return false;
        };
        Integer n = 234345;
        Integer n1 = 345678;
        System.out.println("duplicateDigitsOrNot.test(n) = " + duplicateDigitsOrNot.test(n));
        System.out.println("duplicateDigitsOrNot.test(n1) = " + duplicateDigitsOrNot.test(n1));
    }
}
