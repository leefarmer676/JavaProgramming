package Day15_Loop;

public class Alphabet {
    public static void main(String[] args) {

        for(char c = 'A'; c <= 'Z'; c++){ //you can use ascii table for int - 65 to 90 is A to Z
            System.out.print(c + " ");
        }

        System.out.println();

        for(char c = 'z'; c>= 'a'; c--){
            System.out.print(c + " ");
        }
    }
}
