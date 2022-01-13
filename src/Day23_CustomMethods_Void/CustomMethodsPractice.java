package Day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5times();
        helloCydeo5times();
        evenNumbers();

    }
    //create a function that can print hello world five times
    public static void helloWorld5times (){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }
    //create a function that can print hello cydeo 5 times
    public static void helloCydeo5times (){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    //create a functionthat can print all even numbers from 1~10 ==> even numbers
    public static void evenNumbers (){
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);

        }
    }
}
