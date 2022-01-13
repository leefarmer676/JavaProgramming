package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //prints each integer of an integer array in separate lines
    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);  
        }
    }
    
    //prints each double of a double array in separate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    
    //prints each char of a char array in separate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each String of a String array in separate lines
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }
    
    //returns the maximum number for integer array
    public static int maxNum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //add max number for double!!!!

    //returns the minimum number for double array
    public static double minNum(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    
    //returns the minimum number for integer array
    public static int minNum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    
    //checks if the given int is contained in the given array. returns boolean. contains (int[], int)
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
        if(each == element){
            result = true;
        }
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean. contains (double[], double)
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean. contains (String[], String)
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean. contains (char[], char)
    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //adds given element to array, returns new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i=0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    //adds given element to array, returns new array
    public static double [] addElement (double[] array, double element){
        double [] result = new double [array.length +1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element; //element has to be assigned to the last index
        //or result[result.length-1] = element;
        return result;
    }

    //adds given element to array, returns new array
    public static String[] addElement (String[] array, String element){
        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[i]=element;

        return result;

    }

    //adds given element to array, returns new array
    public static char[] addElement (char[] array, char element){
        char[] result = new char[array.length+1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }
        result[i]=element;

        return result;

    }

    //returns frequency of given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static double frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
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

    public static int[] removeElement(int[] array, int index) {

        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        int [] result = {};

        for (int i = 0; i < array.length; i++) {//i=array's index number
            if (i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
    public static double[] removeElement(double[] array, int index) {

        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        double [] result = new double[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {//i=array's index number
            if (i == index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
    public static char[] removeElement(char[] array, int index) {

        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        char [] result = new char[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {//i=array's index number
            if (i == index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
    public static String[] removeElement(String[] array, int index) {

        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        String [] result = new String[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {//i=array's index number
            if (i == index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[]arr1, int[]arr2){
        //int[] result = new int[arr1.length+arr2.length];//make sure the new array has correct capacity
        int[]result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
            for (int each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }    
            return result;

    }
    public static double[] merge(double[]arr1, double[]arr2){
        //int[] result = new int[arr1.length+arr2.length];//make sure the new array has correct capacity
        double[]result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }
    public static char[] merge(char[]arr1, char[]arr2){
        //int[] result = new int[arr1.length+arr2.length];//make sure the new array has correct capacity
        char[]result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }
    public static String[] merge(String[]arr1, String[]arr2){
        //int[] result = new int[arr1.length+arr2.length];//make sure the new array has correct capacity
        String[]result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }

    //reverse the array, returns a new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // replace elements of array at given index with given new element
    public static int [] replaceElement(int[]array, int index, int newElement){
        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    public static double [] replaceElement(double[]array, int index, double newElement){
        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    public static char [] replaceElement(char[]array, int index, char newElement){
        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    public static String [] replaceElement(String[]array, int index, String newElement){
        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replaces all matching old values of the array with new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
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
