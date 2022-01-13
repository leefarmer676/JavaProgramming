package Day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {
    public static int publicData = 100;
    static int defaultData = 200; //access modifier: default, aka no access modifier
    private static int privateData = 300;

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(privateData);
        System.out.println(defaultData);
    }
}
