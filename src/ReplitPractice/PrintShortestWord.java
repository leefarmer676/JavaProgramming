package ReplitPractice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintShortestWord {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String [] outputArray = str.split(", ");
        String shortestWord = "longestwordhastobetomakeitwork";
        String tempMultipleWords = "";
        //int wordLength = Integer.MAX_VALUE;
        for (String eachWord : outputArray) {
            if(eachWord.length()<shortestWord.length()){
                shortestWord = eachWord;
            }else if(eachWord.length()==shortestWord.length()){
                tempMultipleWords += ", " + eachWord;
            }else{
                continue;
            };

        }
        String result = shortestWord + tempMultipleWords;

        String[] resultArray = result.split(", ");

        List<String> list = Arrays.asList(resultArray);
        Collections.sort(list);
        System.out.println(list);
    }
}
