package Day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "husky", 'M', 2, "small", "white");

        dog.eat();
        dog.sleep();
        dog.drink();
        dog.move();
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher", "Bengal", 'M', 4, "large", "red" );
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);


    }
}
