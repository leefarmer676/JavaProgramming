package Day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500,600};
        numbers = removeElement(numbers, 1);//creates new arrray without 200
        System.out.println(Arrays.toString(numbers));

    }


    //                                 {1,2,3,4}        2 (remove #3)
    public static int[] removeElement(int[] array, int index){
        if(index<0||index>array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        int[]result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i==index){//if the element of array is matching the element at given index
                continue;//skip
            }else{
                result [j++] = array[i];
            }

        }
        return result;
    }
}
