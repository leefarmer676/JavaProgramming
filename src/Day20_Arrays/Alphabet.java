package Day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26];//store characters Z~A

        for(char i =0, j= 'Z'; i < alphabets.length; i++, j--) {
            alphabets[i] = j;
        }
        /*
                  i       ch
        alphabets[0] = 'Z'; //ascii table #90
        alphabets[1] = 'Y'; //ascii table #89
        alphabets[2] = 'X'; //88

        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }

         */
            System.out.println(Arrays.toString(alphabets)); //print the whole array, needs .toString
            //System.out.println(alphabets[0]); //printing the element of array


    }
}
