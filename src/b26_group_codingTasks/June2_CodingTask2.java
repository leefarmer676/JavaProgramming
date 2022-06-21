package b26_group_codingTasks;

public class June2_CodingTask2 {
    /*
    2) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
     */
    public static boolean passwordValidOrNot(String password) {
        if (password.length() < 6) {
            return false;
        } else if (password.contains(" ")) {
            return false;
        }

            for (int i = 0; i < password.length() - 1; i++) {
                if (!(password.charAt(i) > 65 && password.charAt(i) < 90)) {
                    return false;
                } else if (!(password.charAt(i) > 97 && password.charAt(i) < 122)) {
                    return false;
                }
            }


        return true;
        //char c = something . isLetter or isDigit

    }

    public static void main(String[] args) {
        System.out.println(passwordValidOrNot("AAAAabc"));
    }
}
