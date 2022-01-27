package Day37_Inheritance.phoneTask;

public final class Iphone extends Phone{

    public final void faceTime(long phoneNumber){//can overload any methods, incl. final - gray bc unneccessary since class is already final
        System.out.println(brand + " " + model + " is FaceTiming with phone number: " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + " " + model + " is FaceTiming with email: " + email);
    }

    public String toString() {
        return "Iphone{}";
    }

    public Iphone(String brand, String model, String size, double price, String color) {
        super("Apple", model, size, price, color); //applied Apple to brand for this class
        //don't need the argument; just set the data
    }
}
