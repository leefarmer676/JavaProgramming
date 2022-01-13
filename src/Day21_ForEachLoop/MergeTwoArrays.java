package Day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String [] group1 = {"Ali", "Layan", "Aysenur"};
        String [] group2 = {"Maria", "Aygun", "Duygu","Suat", "Valeriy", "CyKyle"};

        String [] students = new String[group1.length + group2.length]; //to makesure 3rd array has capacity for both

        int i = 0;
        for (String each : group1) {
            students [i++] = each;
        }

        for (String each : group2) {
            students [i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------");

        char [] ch1 = {'A', 'B', 'C'};
        char [] ch2 = {'D', 'E', 'F', 'G', 'H'};

        int j = 0;
        char [] chars = new char[ch1.length + ch2.length];
        for (char each : ch1) {
            chars [j] = each;
            j++;
        }
        for (char each : ch2) {
            chars [j] = each;
            j++;
        }
        System.out.println(Arrays.toString(chars));

    }
}
