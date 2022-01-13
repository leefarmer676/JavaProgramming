package day03_EscapeSequences;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //Integer: age, year, salary, miles
        byte age = 35;
        short year = 2000;
        int salary = 100000;
        long miles = 9999999999999l;

        // Decinamls: tax, pi
        double tax = 0.26;  //preferred
        float pi = 3.14f;

        // symbols: @, #
        char ch1 = '@';
        char ch2 = '#';


        System.out.println(age);
        System.out.println(year);
        System.out.println(salary);
        System.out.println(miles);
        System.out.println(tax);
        System.out.println(pi);
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("-----------------");

        boolean result1 = true;
        boolean result2 = false;
        boolean result3 = 5 > 10;


        System.out.println(result3);

        System.out.println("---------");

        int a = 100;
        int b = 200;

        boolean aIsGreaterThanB = a > b;

        System.out.println(aIsGreaterThanB);
    }
}
