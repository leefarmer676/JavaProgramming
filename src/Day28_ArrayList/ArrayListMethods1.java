package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//implicitly converts int to Integer wrapper class
        numbers.add(20);//1
        numbers.add(30);//2--shift to 3
        numbers.add(40);//3--shift to 4
        numbers.add(50);//4--shift to 5
        numbers.add(60);//5-- shift to 6
        numbers.add(2, 25);//2 different options for ".add"
        numbers.add(5, 45);
        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;//this is how you get the last index number

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);//returns element presented at given index

        System.out.println("num = " + num);

        System.out.println("-------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+ " "); //prints out each element from the ArrayList

        }
        System.out.println();
        System.out.println("----------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "Javascript");
        list.set(3, "C++");

        System.out.println(list);


    }
}
