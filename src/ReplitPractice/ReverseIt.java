package ReplitPractice;

public class ReverseIt {
    public static void main(String[] args) {
        String word = "apple";
        String result = "";
        if(word.length()==5){
            for(int i = word.length()-1; i>=0 ;i--){
                result += word.charAt(i);
            }
            System.out.println(result);
        }else if(word.length() < 5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }
    }
    }

