package Day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1;//autoboxing - done implicitly

        int num2 = n1; //unboxing = done implicitly

        System.out.println("--------------------");

        Integer integerValue = 100;

        long longValue = integerValue; //primitives accept any wrapper class value as long as it's in range

        Byte b1 = 25;
        byte a1=b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("------------------");

        int num3 = 200;

        //Long l2 = num3; cannot work

        Integer num4 = num3; //autoboxing

        System.out.println("--------------------");

        Integer z = 900;
        Integer y = z;

        System.out.println("--------------------------");

        int [] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};


    }
}
