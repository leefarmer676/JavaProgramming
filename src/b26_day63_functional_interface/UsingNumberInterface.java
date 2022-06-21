package b26_day63_functional_interface;

import java.util.function.Consumer;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (num) -> {
            if(num%2==0){
                System.out.println(num + " is even");
            }else{
                System.out.println(num + " is odd");
            }
        };

        evenOrOdd.apply(5);
        evenOrOdd.apply(10);

        NumberInterface cube = (number) -> {
            System.out.println(number*number*number);
        };

        cube.apply(3);
        cube.apply(10);

    }

    public static class UseConsumer {
        public static void main(String[] args) {

            Consumer<Integer> printToN = n -> {
                for (int i = 0; i <= n; i++) {
                    System.out.print(i + " ");
                }
            };
            printToN.accept(50);
        }
    }
}
