package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String [] sent = sentence.split(" ");

        System.out.println(Arrays.toString(sent));

        String reversedSentence = "";

        for (int i = 0, j=sent.length-1; i < sent.length; i++, j--) {//just needed forr with only i, not j to work
            reversedSentence += sent[j] + " ";

        }

        System.out.println(reversedSentence);
        //   i   ++        j--
        //sent[0] = sent[sent.length-1];
        //System.out.println(sent[0]);


    }
}
