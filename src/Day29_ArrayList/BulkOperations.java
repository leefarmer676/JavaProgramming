package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,5,8));//needs to put it in array, so it's a collection type

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));//will remove all instances of those numbers
        //specify element not index of what you want to remove

        System.out.println(list);

        System.out.println("--------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        //remove all elements except 100, 200, 300
        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);

        System.out.println("---------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Devel", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("-----------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1 = nums.contains(10);
        System.out.println("r1 = " + r1);
        boolean r2 = nums.contains(Arrays.asList(2,5,10));//false bc you can only do one at a time
        System.out.println("r2 = " + r2);
        boolean r3 = nums.contains(2) && nums.contains(5) && nums.contains(10);//true
        System.out.println(r3);

        boolean r4 = nums.containsAll(Arrays.asList(2,5,10));//true - this is how you do mlutipel at one time
        System.out.println("r4 = " + r4);

        System.out.println("------------------");

        String [] names = {"Josh", "Jack", "Danielk", "Shay", "Breanna"};
        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));//can convert non-primitive array to ArrayList

         */

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));//converted to array list

        System.out.println(namesList);

        System.out.println("----------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};//how to convert primitive array to arrayList - you cannot
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("-----------------------");
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);




    }

    //converts primitive array to ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[]array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
