package b26_day64_functionalInterface_lambdaExpression;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
        public static void main(String[] args) {
            BiPredicate<Integer[], Integer> contains = (arr, num) -> {

                for (int each : arr){
                    if(each == num){ //if this statement is ever true, then my array does contain the number that we were looking for, so we return true
                        return true;
                    }
                }
                return false;
            };

            Integer [] arr = {4,3,5,7,88,8};
            System.out.println(contains.test(arr, 3));


            BiPredicate<String, String> anagram = (one, two) -> {

                char [] oneArr = one.toCharArray();
                char [] twoArr = two.toCharArray();
                Arrays.sort(oneArr);
                Arrays.sort(twoArr);
                return Arrays.equals(oneArr, twoArr);
            };
            System.out.println("anagram.test(\"listen\", \"silent\") = " + anagram.test("listen", "silent"));
        }
    }


