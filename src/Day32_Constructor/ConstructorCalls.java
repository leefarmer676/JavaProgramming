package Day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls object1 = new ConstructorCalls();

        System.out.println("-------------------");

        ConstructorCalls object2 = new ConstructorCalls(10);

        System.out.println("----------------------");

        ConstructorCalls object3 = new ConstructorCalls("word");

    }
}
