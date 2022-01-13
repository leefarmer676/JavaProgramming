package Day14_String;

public class EmailTask1 {

    public static void main(String[] args) {

        String email = "lee.farmer0208@gmail.com";

        String firstName = email.substring(0, email.indexOf("."));
        String lastName = email.substring(email.indexOf(".") + 1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        email = firstName + "." + lastName + rest;

        System.out.println(email);

    }
}
