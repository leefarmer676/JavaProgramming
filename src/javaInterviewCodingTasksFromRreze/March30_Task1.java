package javaInterviewCodingTasksFromRreze;

public class March30_Task1 {

    public static void max_number_from_intArray (int[] intArray){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>max){
                max = intArray[i];
            }
        }
        System.out.println("max = " + max);
    }



    /*
    1.Array -- Find Minimum
Write a method that can find the maximum number from an int Array
     */
}
