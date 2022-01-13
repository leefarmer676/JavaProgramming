package Day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";

        int num = Integer.parseInt(str); //returns int value - this is primitive assigned ot primitive
        //not autoboxing or unboxing. parse method returns primitive

        System.out.println(num+1); //124
        System.out.println(str+1); //1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); //return type is double

        System.out.println(num2+1); //11.5

        int max = Integer.MAX_VALUE;//tells max value of this primitive type
        int min = Integer.MIN_VALUE;//tells min value of this primitive type

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "true";
        String s2 = "maybe"; //parse to boolean would return false

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1); //tru

        System.out.println("-------------");

        String s3 = "123";
        Integer x = Integer.valueOf(s3); //return you Integer
        int y = Integer.valueOf(s3); //Integer -- unboxing

        System.out.println(x); //returns you 123 as an integer
        System.out.println(y);

        String s4 = "1.5";
        double z = Double.valueOf(s4); //Double

        System.out.println(z);

        System.out.println("-------------------");

        //isDigit() to verify if character is digit
        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);//returns true

        boolean r3 = Character.isLetter(ch1);

        System.out.println("r3 = " + r3);//false
        //do not have a method to verify special char

        boolean r4 = !Character.isLetterOrDigit(ch1); //returns true if special char
        System.out.println("r4 = " + r4);

        //verify if letter is uppercase or lowercase
        boolean r5 = Character.isUpperCase(ch1); //returns boolean

        //lowercase
        boolean r6 = Character.isLowerCase(ch1);
        System.out.println("r6 = " + r6);

        System.out.println("--------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        //task:

        for (char each : s.toCharArray()) {//convert to CharArray then you can call for each loop
            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each); //must convert char to digit before adding to sum
            }
        }
        System.out.println("sum = " + sum);
    }
}
