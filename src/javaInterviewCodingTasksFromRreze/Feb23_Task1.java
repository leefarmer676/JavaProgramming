package javaInterviewCodingTasksFromRreze;

public class Feb23_Task1 {
    public static void main(String[] args) {


        String str = "AABCCD";
        String character = "";
        String result = "";

        for (int i = 0; i < str.length(); i++){

            character = ""+str.charAt(i);

            if(str.indexOf(character)==str.lastIndexOf(character)){
                result += character;

            }
        }
        System.out.println(result);
    }

}
