package b26_group_codingTasks;
/*
4) Array - Find Maximum & Find Minimum
Write a method that can find the maximum number from an int Array
Write a method that can find the maximum number from an int Array
 */
public class June2_CodingTask4 {
    public static void maxNumFromArray(int[]arr){
        int maxNumber = Integer.MIN_VALUE;
        for (int each : arr) {
            if(each>maxNumber){
                maxNumber = each;
            }
        }
        System.out.println(maxNumber);
    }

    public static void minNumFromArray(int[]arr1){
        int minNumber = Integer.MAX_VALUE;
        for (int each : arr1) {
            if(each<minNumber){
                minNumber = each;
            }
        }
        System.out.println(minNumber);
    }

    public static void main(String[] args) {
        int[]array = {1,2,-10,17};
        maxNumFromArray(array);
        minNumFromArray(array);
    }
}
