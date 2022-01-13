package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCCD";
        String result = "";

        /*if(str.indexOf('A')==str.lastIndexOf('A')){
            result += 'A';
            below, assign it to a char
         */

        for (int i = 0; i <= str.length()-1 ; i++) { //or i<str.length() instead of <= and -1
            char ch = str.charAt(i);
            //System.out.println(ch);//this will print out every single character in the String
            if(str.indexOf(ch)==str.lastIndexOf(ch)){ //if 1st and last index #s of characters are =, then characters are unique
                result += ch;//this only adds it if it's unique

        }
        //char ch = 'B'; changed this to char ch = str.charAt(i); - this is each char in the string

        }
        System.out.println(result);
    }
}
