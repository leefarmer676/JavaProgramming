package Day21_ForEachLoop;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "Aaron", "Daniel"};

        String [] earlyBirds = Arrays.copyOf(students, 3);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 5); //1,2,3,4,5

        System.out.println(Arrays.toString(numbers)); //1,2,3,4,5 since it has been assigned

        System.out.println("---------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char [] ch2 = Arrays.copyOfRange(ch1, 2, 6);//2 included; 6 excluded; c,d,e,f

        System.out.println(Arrays.toString(ch2));

        int [] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int [] result = Arrays.copyOfRange(scores, 3, 7+1);
        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(scores, 5, scores.length);//this is to get to the last element\\

        System.out.println(Arrays.toString(result2));


    }
}
