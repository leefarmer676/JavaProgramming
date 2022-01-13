package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School!@#%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; //CydeoSchoolWoodenSpoon
        String specialChars = ""; //!@#%

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (0~last index)

            char ch = str.charAt(i); //ch: each character that we have in str

            if (ch >= '0' && ch <= '9') //if character is between character 0 and character 9
                digits += ch;

            else if (ch >= 'A' && ch <= 'Z') { // can also use || to combine lower and upper case if statements
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else { //if character is neither digit nor letter, it must be special character
                if (ch != ' ') { //if the character is not a space - added this if within the else
                    specialChars += ch;
                }

            }
            System.out.println("specialChars = " + specialChars);
            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);
        }
    }
}
