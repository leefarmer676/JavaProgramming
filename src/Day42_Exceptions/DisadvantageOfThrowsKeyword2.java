package Day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {
    public static void method1() throws FileNotFoundException{
        new FileInputStream("");
    }

    public  static void method2() throws FileNotFoundException{
        method1();
    }

    public static void method3(){//add throws keyword if you're sure method3 won't be called elsewhere
        //method2();//checked exception here
    }
}
