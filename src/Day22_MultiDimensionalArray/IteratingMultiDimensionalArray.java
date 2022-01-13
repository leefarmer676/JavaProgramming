package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for (int i = 0; i < arr2D.length; i++) { //i: Index numbers of single dimensional arrays

            //System.out.println(Arrays.toString(arr2D[i]));
            for (int i1 = 0; i1 < arr2D[i].length; i1++) {//i1 = index number of elements
                System.out.print(arr2D[i][i1]+ " ");

            }
            System.out.println();

        }

    }
}
