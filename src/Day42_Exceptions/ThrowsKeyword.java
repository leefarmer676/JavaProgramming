package Day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {//best solution if this won't be called anywhere else
        System.out.println("-----------Test 1---------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("--------Test 1 completed-----------------");

        System.out.println("-------------Test 2--------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("---------------Test 2 completed----------------");
    }
}
