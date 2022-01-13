package Day15_Loop;

public class StringMethods {
    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty();

        System.out.println(r);

        boolean t = str.isBlank();

        System.out.println(t);

        System.out.println("-------------------");

        String s1 = "CYDEO";

        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("yEs".equals("Yes")); //false
        System.out.println("Yes".equalsIgnoreCase("yEs")); //true

        System.out.println("--------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#"); //.contains() is case sensitive
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.toLowerCase().contains("java");//this is ignoring case sensitivity
        boolean r3 = sentence.contains("java") || sentence.contains("Java"); //this only allows those two versions

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);

        System.out.println("---------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input2.equals(input1));
        System.out.println(input2.equalsIgnoreCase(input1));

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input2.toLowerCase().contains("java"));
        //equalsIgnoreCase cannot be used with contains

        System.out.println("-----------------------");

        String a= "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}
