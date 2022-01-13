package Day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = 65; //can use a # because number represents things on ascii table; can use '@' etc.

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {//can replace A with 65, etc. from ascii table


            System.out.println("Alphabetic");
        } else {

            System.out.println("Special Character");

        }
    }
}