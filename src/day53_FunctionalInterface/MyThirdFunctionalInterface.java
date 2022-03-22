package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface <T> {

    T method(T data); //abstract and public by default

    //create a functional interface that has an abstract method that takes
    // one arg of any type and returns the same type

}
