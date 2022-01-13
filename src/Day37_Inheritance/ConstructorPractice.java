package Day37_Inheritance;

class A{
   public A(int a){
       System.out.println("A");
   }

}

class B extends A{
    //super() - gave it to us by default
    public B(){
        super(9); //A B
        System.out.println("B");
    }

}


public class ConstructorPractice {
    public static void main(String[] args) {

        B obj = new B(); //A then B prints bc it's calling parent constructor first implicitly
        //wouldn't have happened if teh public A() had an argument -- public A(int a)
    }
}
