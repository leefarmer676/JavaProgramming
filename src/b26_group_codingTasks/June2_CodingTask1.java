package b26_group_codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class June2_CodingTask1 {
    /*
    1) String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
sort the individual string and append them back together. Ex:
Input:  "DC501GCCCA098911"
Output: "CD015ACCCG011899"

     */
    public static void main(String[] args) {
//
  //      char c = input.charAt(i);
    //then you can do if(Character.isDigit etc)
        //added dashes in to be able to differentiate when the numbers and letters start and stop
        //if it's a dash, then put the characters in the num?
        String input = "DC501GCCCA098911";
        String numbers = "";
        String characters = "";
        List<String> list1 = null;
        for (int i = 0; i < input.length() - 1; i++) {
            System.out.println(input.charAt(i));
            list1 = new ArrayList<>(Arrays.asList(input));
            for (String each : list1) {
                if(Character.isLetter(Integer.parseInt(each))){
                    characters += each;
                }else if(Character.isDigit(Integer.parseInt(each))){
                    numbers += each;
                }
            }

        }
        System.out.println(numbers);
        System.out.println(characters);


        System.out.println(Arrays.asList(list1));
    }
}
