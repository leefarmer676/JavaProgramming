package Day20_Arrays;

import java.util.Arrays;

public class ArraysTasks1 {
    public static void main(String[] args) {

        int [] numbers = new int [100];
        int num1 = 1;
        for (int i = 0; i <100 ; i++) {
            numbers[i]=num1++;

        }
        System.out.println(Arrays.toString(numbers));


    }
}
