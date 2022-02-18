package day01_JavaPractice;

abstract class AAA{

}
class BBB extends AAA{

}
class CCC extends BBB{

}

public class Test7 {
    public static void main(String[] args) {
        AAA obj1 = new BBB();
        AAA obj2 = new CCC();
        BBB obj3 = new CCC();
        //CCC obj4 = new BBB();


    }
}
