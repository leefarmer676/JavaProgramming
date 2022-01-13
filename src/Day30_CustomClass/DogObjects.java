package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

//we will only use custom classes for creating objects; not running ;that's why there's no main method
public class DogObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog(); //constructor name always the same as the class name

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog2.setInfo("Jack", "German Shepherd", 2, 'M', "Large", "Black");

        System.out.println(dog1);//will print hashcode because there's no String method in Dog class - added after this
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Riley", "boxer", 7, 'F', "medium", "black");
        Dog dog5 = new Dog();
        dog5.setInfo("Cole", "pit bull", 6, 'M', "medium", "brown");

        System.out.println("----------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));

        femaleDogs.removeIf(p->p.gender=='M');


        System.out.println(femaleDogs);

        System.out.println(maleDogs);
    }



}
