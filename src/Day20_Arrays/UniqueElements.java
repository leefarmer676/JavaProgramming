package Day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String [] words = {"Java", "Jav", "C#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) {


            String element = words[j];
            int count = 0;
            for (int i = 0; i < words.length; i++) { //finds the frequency of element from array
                if (words[i].equals(element)) {//i stands for each element in the array
                    count++;
                }
            }
            if(count ==2){
                System.out.println(element);
            }
        }


    }
}
