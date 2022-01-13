package Day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
     String password = "cLdeo1990@";

     int countUpperCase = 0;
     int countLowerCase = 0;
     int countDigits = 0;
     int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }
        }

        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);

        boolean hasUpperCase = countUpperCase >0;
        boolean hasLowerCase = countLowerCase >0;
        boolean hasDigit = countDigits >0;
        boolean hasSpecialChars = countSpecialChar >0;

        boolean isStrongPassword = password.length()>=8 && !password.contains(" ") && hasSpecialChars &&
                hasUpperCase && hasLowerCase && hasDigit;

        System.out.println("isStrongPassword = " + isStrongPassword);
    }


}
