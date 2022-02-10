package Day44_AbstractionContinued.animalTask;

public final class Dog extends Animal implements Playable {
    //if parent class has a constructor, child class must call it
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    //unique method for dog class - added before extending animal
    //cannot inherit "name" because it's private; must use getName to use private field
    public void bark(){
        System.out.println(getName()+ " is barking");
    }
    //override abstract method from parent class - access modifier same or more visible,
    //return type same, parameters same, etc.
    @Override
    public void eat() {
        System.out.println(getName()+ " is eating pizza");
    }

    public void play(){
        System.out.println(getName()+ " is playing with ball");
    }


}
