package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Ahmed", "ahmed", "Yuliia", "Chris"));

        //cannot do ignorecase in below
        //names.removeAll(Arrays.asList("Ahmed"));

        //have to apply the iterable
        //first, call the iterator method that is inherited to all collection type
        //return type of method is Iterator<String> - hover to see which one works
        Iterator <String> it = names.iterator();

        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("-----------------------------");

        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Ahmed", "ahmed", "Yuliia", "Chris"));

        for(Iterator<String> i=names1.iterator(); i.hasNext(); ){
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names1);

        System.out.println("---------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Ahmed", "ahmed", "Yuliia", "Chris"));

        names3.removeIf(each -> each.equalsIgnoreCase("ahmed"));

        System.out.println(names3);

        System.out.println("--------------------------");

        Set <Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,8,9,100));

        Iterator<Integer> q = set.iterator();

        while(q.hasNext()){
            if(q.next()%2==0){
                q.remove();
            }
        }

        System.out.println(set);
    }

}
