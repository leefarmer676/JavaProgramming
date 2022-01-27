package Day40_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', "white", "large", 4);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());
        dog.drink();


    }
}
