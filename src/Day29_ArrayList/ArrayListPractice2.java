package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Arron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("David", "Ahmed"));

        System.out.println(employees);

        System.out.println("------------------");

        String[] names = {"Mary", "Mon", "Mehray", "Musti", "Sumeyra", "hasan", "Beril"};

        //convert string array to arrayList

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );

        list.removeIf(p-> p.startsWith("M")); //or p.charAt(0) == 'M'

        System.out.println(list);

        //convert arraylist back ot array with to array method

        names = list.toArray(new String [0]);

        System.out.println(Arrays.toString(names));

    }
}
