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


    public default void drink() {       //default method allows you to create method with implementation/body
        System.out.println("Default method");
    }
}
