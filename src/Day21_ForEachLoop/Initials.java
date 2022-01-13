package Day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String [] names = {"Cydeo School", "Wooden Spoon", "Jav Prog", "SQ Prog", "Sel Aut", "AP Tes", "Data Tes", "Man Tes"};

        for (String each : names) {
            String initial = each.charAt(0) + "" + each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }


    }
}
