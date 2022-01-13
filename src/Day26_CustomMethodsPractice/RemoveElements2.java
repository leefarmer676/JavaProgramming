package Day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {


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



}