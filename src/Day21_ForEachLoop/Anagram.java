package Day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        //write program that can check if str1 and str2 are built out of same chars

        char [] char1 = str1.toCharArray();
            System.out.println(Arrays.toString(char1));

            char [] char2 = str2.toCharArray();
        System.out.println(Arrays.toString(char2));

        Arrays.sort(char1);
        System.out.println(Arrays.toString(char1));

        Arrays.sort(char2);
        System.out.println(Arrays.toString(char2));

        boolean anagram = Arrays.equals(char1, char2);//must use arrays.equals; not if(ch1.equalsch2) etc

        System.out.println(anagram);

        System.out.println("------------------------");


        String sentence = "Wooden Spoon";

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------");

        String email = "WoodenSpoon@cydeo.com";

        String [] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String [] sentences = s.split("\\. ");

        System.out.println(Arrays.toString(sentences));






        }



    }

