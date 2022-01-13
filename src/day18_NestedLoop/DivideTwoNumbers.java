package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        int count = 0; //so we can count how many times b will be subtracted from a

        while(a >= b){
            a -= b;
            count++;
        }

        System.out.println(count + " with a remainder of " + a );



    }
}
