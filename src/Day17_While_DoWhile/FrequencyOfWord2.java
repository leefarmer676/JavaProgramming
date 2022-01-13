package Day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog";
        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) { //i can be a maximum of 7, so you have to subtract 3 (without less than equal)
            String eachSub = str.substring(i, i+3);

            if(eachSub.equals("Cat")){
                frequency+=1; //or frequency++


            }
        }
        System.out.println("frequency = " + frequency);
    }

    }

