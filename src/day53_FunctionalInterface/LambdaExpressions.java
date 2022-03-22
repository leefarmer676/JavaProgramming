package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();//watch short videos to learn StringBuilder
                    return reverse;
                };
        String result = stringReverse.method("Wooden Spoon");
        System.out.println(result);

        MyThirdFunctionalInterface <Integer> intCube =
        (i) -> {
            Integer cube = i*i*i;
            return cube;
        };

        Integer result1 = intCube.method(3);
        System.out.println(result1);
    }

}
