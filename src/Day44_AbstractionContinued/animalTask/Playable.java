package Day44_AbstractionContinued.animalTask;

public interface Playable {
    boolean isFriendly = true; //static and final by default
    //cannot have static block so must initialize variable by assigning it immediately, since it's final
    //static members only accept static variables

    //public static void method1(){
      //  System.out.println(isFriendly);
        //since it can call this boolean isFriendly, it proves that it is static

        void play(); //abstract by default
    }


