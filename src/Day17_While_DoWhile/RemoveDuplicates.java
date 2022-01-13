package Day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";

        String result = ""; //"ABC"

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(0); //you have to convert it to String because contains method has to be String

            if (result.contains(ch)) {
                continue; //skip
            } else {
                result += ch;

            }

        }
    }
}
