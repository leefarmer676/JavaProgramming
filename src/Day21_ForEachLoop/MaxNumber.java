package Day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        /*
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) { //if there is element in the array that's greater than teh current max #
                max = numbers[i];
            }

        }

         */

        for(int each :numbers ){
            if(each>max){
                max = each;
            }

        }
        System.out.println(max);

    }
}


