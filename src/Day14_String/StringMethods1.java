package Day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "   batch   25         ";
        str1 = str1.trim(); //creates a new string "batch 25"
        //once you add "str1= before str1.trim();, then the print line willprint without the spaces

        System.out.println(str1); // this still prints with the white spaces since it's not assigned back

        String str2 = "Cydeo School";

        int n1 = str2.indexOf ("h"); //this will return the index number of this character
        //index number is integer
        System.out.println("n1 = " + n1);

        str2.indexOf("o");//this will return the first "o" that's in the string

        String str3 = "Java Programming language";
        int n3 = str3.indexOf("amm");

        System.out.println("n3 = " + n3);


    }
}
