package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true

        System.out.println("---------------------");

        int a = 5;
        ++a; //pre-increment: increases the value by 1 right away

        System.out.println(a); //6

        --a; //pre-decrement: decreases the value by 1 right away

        System.out.println(a); //5

        System.out.println("--------------------");

        int b = 100;
        System.out.println(++b); //pre-increment: increases the value by 1 right away

        int c = 100;

        System.out.println(c++); //post increment: states the current value first, then next line is plus one; first passes the current value, then increases the value by 1
        System.out.println(c); //101

        System.out.println("--------------");

        int x = 200;
        System.out.println(--x); //pre-decrement: decreases the value by one right away

        int y = 200;
        System.out.println(y--); //post-decrement: on this line of print, it will appear with out the decrease by 1; the nex ttime you print this variable, it will appear as decreased by 1
        System.out.println(y);

        System.out.println("---------------------");

        int z = 45;
        System.out.println(++z); //46, z=46
        System.out.println(z++); //46, z=47
        System.out.println(z); //47

        int q = 30;
        System.out.println(--q); //29
        System.out.println(q--); //29, q=28
        System.out.println(q); //28


    }
}
