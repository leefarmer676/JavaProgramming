package Day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int [] arr1 = {1,1,2,2,3,3, 4};
        arr1 = removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-------------");

        String[] arr2 = {"Java", "Java", "Python"};
        arr2 = removeDuplicates(arr2);

        System.out.println(Arrays.toString(arr2));
    }
    // removes the duplicates from given array, returns new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}
