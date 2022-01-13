package Day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String [ ] words = {"Layan", "Layan", "Olek", "Olga", "Adam", "Adam", "Adam", "cihad", "cihad", "Cydeo"};

        for (String each : words) {//each: "Layan", "Layan", "Olek", "Olga", "Adam", "Adam", "Adam", "cihad", "cihad", "Cydeo"};

            int count = 0;

            for (String element : words) {//element: "Layan", "Layan", "Olek", "Olga", "Adam", "Adam", "Adam", "cihad", "cihad", "Cydeo"};

                if(element.equals(each)){
                    count++;
        }


           }
            if(count==1){
                System.out.println(each);
            }
        }


    }
}
