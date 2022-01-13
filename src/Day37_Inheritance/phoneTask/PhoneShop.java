package Day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("Samsung", "galaxy S19", "6 inches", 900, "white");

        Nokia nokia = new Nokia("Nokia", "Brick", "4 inches", 50, "gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456778);
        iphone.faceTime(987239879);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("---------------------");

        samsung.call(897234983);
        samsung.text(987987);
        samsung.freeze();

        System.out.println("-----------------");

        nokia.call(98980);
        nokia.text(97098009);
        nokia.selfDefense();

        System.out.println("---------------------");

        System.out.println(Iphone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
    }
}
