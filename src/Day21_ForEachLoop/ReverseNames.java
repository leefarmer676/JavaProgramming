package Day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String [] names = {"Cydeo School", "Wooden Spoon", "Jav Prog", "SQ Prog", "Sel Aut", "AP Tes", "Data Tes", "Man Tes"};

        for(String each : names ){//each: represents each name..."Cydeo school" etc.

            String reversed = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
               reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
