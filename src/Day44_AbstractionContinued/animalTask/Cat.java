package Day44_AbstractionContinued.animalTask;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is eating fish");
    }

    public void meow(){
        System.out.println(getName()+ " is meowing");
    }

    public void play(){
        System.out.println(getName()+ " is playing with string");
    }
}