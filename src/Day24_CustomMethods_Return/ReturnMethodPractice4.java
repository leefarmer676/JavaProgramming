package Day24_CustomMethods_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str = "cccccccccccccccccdddaaaaaaaaaaabbbbbbbb";
        str = removeDuplicates(str); //can assign it to a variable to make it reusable bc return method
        System.out.println(str);

    }

    public static String removeDuplicates(String str){ //"aaabbcc"
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)){
                result+=each;
            }

        }
        return result;

    }
}
