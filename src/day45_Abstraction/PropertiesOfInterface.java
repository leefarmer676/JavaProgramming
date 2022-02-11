package day45_Abstraction;

public interface PropertiesOfInterface {
    int a = 100; //static and final by default
    static int b = 200;//final by default

    /*
    public PropertiesOfInterface(int a){
        this.a = a;
    }

     */
    /*
    static {
        b=100;
    }

     */
   /*
    public void method1(){
        System.out.println("Instance method");
    }

    */

    public static void method2() {
        System.out.println("static method");
    }

    public abstract void method3();




    public default void method4() {       //default method allows you to create method with implementation/body
        System.out.println("Default method"); //this will be instance method so must be called thru object;
        // doesn't exist wihtout a child class bc no objcts in interface
    }
}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        new Test().method4();
    }
}
