package Day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Lee Farmer",
            buildingNumber = "32",
            streetName = "Hillcrest Drive",
                city = "McLean",
                state = "VA",
                zipCode = "80521A";

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);


    }
}
