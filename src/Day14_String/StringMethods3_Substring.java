package Day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        //subString(beginning index, ending index)

        String word = "Cydeo School";
        //             012345...

        String brand = word.substring(0, 4);
        //prints Cyde - ending index is always excluded
        System.out.println(brand);

        String str1 = word.substring(6, 12);
        //you can also not give the ending index, it would start at 6 til the end of string (6)
        System.out.println(str1);

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0,word2.indexOf(" "));
        String s2 = word2.substring(word2.indexOf("P"), word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.indexOf("L"));

        System.out.println(s1 + " " + s2 + " " + s3);
    }
}
