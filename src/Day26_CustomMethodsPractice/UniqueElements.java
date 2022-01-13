package Day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[] array2 = {1.5,2.5,1.5,3.5,4.5,4.5,5.5,5.5};
        double[] unique1 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique1));
    }

    //returns unique elements from given array
    public static int[] uniqueElements(int[] array) {
        int[] result = {}; //creates new temp array = new int [0];
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
               result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    //returns unique elements from given array
    public static double[] uniqueElements(double[] array) {
        double[] result = {}; //creates new temp array = new double [0];
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    //returns unique elements from given array
    public static char[] uniqueElements(char[] array) {
        char[] result = {}; //creates new temp array = new char [0];
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    //returns unique elements from given array
    public static String[] uniqueElements(String[] array) {
        String[] result = {}; //creates new temp array = new char [0];
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}