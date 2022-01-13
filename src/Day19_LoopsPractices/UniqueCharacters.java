package Day19_LoopsPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; //represents the freq of the variable ch

            for (int i = 0; i < str.length(); i++) { //compares char outer loop picked w each ch of str
                char each = str.charAt(i); //each character of str
                if (ch == each) { //when it matches
                    count++; //will increase by 1
                }

            }
            if(count == 1){ //if freq is unique
                result += ch;

            }
        }
        System.out.println("result = " + result);
    }
}
