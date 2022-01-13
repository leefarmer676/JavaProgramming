package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeef";
        String[] array = str.split(""); //this gets an array that contains each character so i can covert to array list

        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
//cannot convert primitive arrays to an array list with the "asList" - must convert to ArrayList first?
        System.out.println("list = " + list);//array list with each character

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if(frequency == 1){
                unique += each;
            }
        }
        System.out.println("unique = " + unique);



    }
}
