package Day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "JavaJava";
        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) { //i can be a maximum of 7, so you have to subtract 3 (without less than equal)
            String eachSub = str.substring(i, i+4);

            if(eachSub.equals("Java")){
                frequency+=1; //or frequency++


            }
        }
        System.out.println("frequency = " + frequency);
    }
}
