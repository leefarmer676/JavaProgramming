package Day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        arr = replaceElement(arr, 2, 30);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------");

        String[] arr2 = {"Java", "Py", "C" ,"Ruby"};

        arr2 = replaceElement(arr2, 2, "C#");

        System.out.println(Arrays.toString(arr2));
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


}
