package day01_JavaPractice;

public class Test1 {
    public Test1(){
        System.out.println("A");
    }
    public Test1 (int a) {
        this(2.5);
        System.out.println("B");
    }
    public Test1 (double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
    Test1 obj = new Test1(100);


    }
}
