package Day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    static{
        name = "Batch 25";
    }

    public static void main(String[] args) {
        final double pi = 3.14;

        final String name;

        name = "java";

        System.out.println(name);

        System.out.println("------------------------------");

        FinalVariable obj = new FinalVariable("May 1");

        System.out.println(obj.birthDay);

        System.out.println(FinalVariable.name); //static variables called thru class name


    }
}
