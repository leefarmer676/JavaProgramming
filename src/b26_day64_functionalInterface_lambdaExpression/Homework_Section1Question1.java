package b26_day64_functionalInterface_lambdaExpression;

import java.util.Arrays;
import java.util.function.BiPredicate;

/*
Use BiPredicate functional interface to:
        1.1 Create a function that can check if two array are equal and contains the same elements
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}

                output: true
 */
/*
1.2 Create a function that can check if the first array contains all the elemnts of the second array:
                ex: arr1 = {1,2,3,4,5,6}
                    arr2 = {7,8}

                output: false

Use BiFunction functional interface to:
        1.1 Create a function that can returns the common characters of two strings
                ex: str1 = "Python"
                    str2 = "Wooden Spoon"

                output: on

        1.2 Create a function that can return the common elements of two Lists of Integers
 */
public class Homework_Section1Question1 {
    public static void main(String[] args) {


        BiPredicate<int[], int[]> arraysEqual = (arr1, arr2) -> {
            for (int i = 0; i < arr1.length; i++) {

            }
            return false;
        };
        int[] arr1 = {1, 3, 4};
        int[] arr2 = {4, 3, 1};

        System.out.println("arraysEqual.test(arr1, arr2) = " + arraysEqual.test(arr1, arr2));
    }
}
