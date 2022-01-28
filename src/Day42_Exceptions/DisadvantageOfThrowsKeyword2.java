package Day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException{
        method1();//line above - always use the class names compiler tells you, instead of parent class, exception
        method2();
        method3();

        String str = null;
        try {
            System.out.println(str.charAt(0));//unchecked -
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
    public static void method1() throws InterruptedException{
        //new FileInputStream("");
    }

    public  static void method2() throws InterruptedException{
        method1();
    }

    public static void method3(){//add throws keyword if you're sure method3 won't be called elsewhere
        //method2();//checked exception here
    }
}
