package Day21_ForEachLoop;

import java.beans.beancontext.BeanContextChild;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";
        char [] chars = str.toCharArray();

        for (char each : chars){
            System.out.println(each);
        }
        System.out.println("----------------------");
    }
}
