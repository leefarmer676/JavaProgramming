package Day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int num = 10;

        String name = (num == 1)? "January" :(num == 2)? "February" :(num == 3)? "March" :(num== 4)? "April" :(num == 5)? "May"
                :(num == 6)? "June" :(num == 7)? "July" :(num == 8)? "August" :(num == 9)? "September"
                :(num == 10)? "October" :(num == 11)? "November" : "December";
        //parentheses are optional for ternary, but he recommends always using the parentheses
        //number of colons and question marks have to be equal



        System.out.println(name);
    }
}
