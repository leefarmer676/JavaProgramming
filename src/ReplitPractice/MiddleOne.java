package ReplitPractice;

public class MiddleOne {
    public static void main(String[] args) {
        String word = "apple"; //replit uses scanner for words
        if(word.length()%2==1 && word.length()>=3){
            String middleLetter = word.substring(word.length()/2, (word.length()/2)+1);
            System.out.println(middleLetter);
        }else if(word.length()==1){
        System.out.println(word + word + word);
    }else if(word.length()%2==0 && word.length()>=4){
        String middleTwo = word.substring((word.length()/2)-1, (word.length()/2)+1);
        System.out.println(middleTwo);
    }else if(word.length()==2){
        System.out.println(word + word);
    }else{
        System.out.println("Invalid response");
    }


}
}
