package day01_JavaPractice;

import Day24_CustomMethods_Return.ReturnMethodIntro;
import Day24_CustomMethods_Return.ReturnMethodPractice4;
import utilities.StringUtility;

public class Test {
    public Test(){
        System.out.println("A");

    }
public Test (int a){
        this();
    System.out.println("B");
}
public Test (String str ){
        this();
    System.out.println(str);
}
    public static void main(String[] args) {
        Test obj = new Test();
    }
}
