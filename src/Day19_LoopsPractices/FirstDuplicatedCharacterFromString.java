package Day19_LoopsPractices;

public class FirstDuplicatedCharacterFromString {
    public static void main(String[] args) {

        String str = "abcddeeefffffffffgh";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!(str.indexOf(each) == (str.lastIndexOf(each)))) {
                if (!(result.contains("" + each))) {
                    result += each;
                    break;

                }


            }

        }
        System.out.println(result);
    }
}
