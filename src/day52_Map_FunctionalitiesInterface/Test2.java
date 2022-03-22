package day52_Map_FunctionalitiesInterface;

public class Test2 {
    public static void main(String[] args) {

        //create function that can print each character of a String
        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden spoon");

        MySecondFunctionalInterface <Integer> cube = n -> {
            System.out.println(n*n*n);
        };

        cube.test(5);

    }
}
