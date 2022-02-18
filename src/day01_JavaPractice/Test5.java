package day01_JavaPractice;

class AA{
    protected void methodA(){
        System.out.println("Method A");
    }
}
class BB extends AA{
    public void methodA(){
        System.out.println("Method C");
    }
    public void methodB(){
        System.out.println("Method B");
    }
}

public class Test5 {
    public static void main(String[] args) {
        AA obj = new BB();
        obj.methodA();
    }
}
