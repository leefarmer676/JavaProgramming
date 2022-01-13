package Day06_PrimitiveTypeCastings;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //(short)a

        int c = b;
        // int c = (int)b

        long d = c;
        //  (long)c; smaller primitive you can assign to larger primitive

        float e = d;
        double f = e;

        //explicit casting
        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " + k);

        double n = 10.8;
        int s = (int)n;

        System.out.println(n + " : " + s);

        System.out.println("----------------------");

        double d1 = 20.5;
        short s1 = (short) d1;


    }
}
