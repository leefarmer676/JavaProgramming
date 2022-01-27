package Day37_Inheritance.phoneTask;

public final class Nokia extends Phone{
    public Nokia(String brand, String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense (){
        System.out.println("You can use " + brand + " " + model + " for self defense");
    }

    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
