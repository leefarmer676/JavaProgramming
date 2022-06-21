package b26_day63_functional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {
        boolean r1 = UsePredicate.isPalindrome.test("kayak");
        System.out.println(r1);

        System.out.println(UsePredicate.isPrime.test(5));
    }


}
