package utilities;

import Day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {


    public static void main(String[] args) {
        System.out.println(ProtectedAccessModifier.name2);
        System.out.println(AccessModifiers_Test4.name2);//visible outside package in subclass only
      //  System.out.println(AccessModifiers_Test4.name1);//default is not visible outside the package
    }
}
