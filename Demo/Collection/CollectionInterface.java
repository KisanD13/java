package Demo.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {
    static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

//        System.out.println(collection);
//
//
//        for (Integer integer : collection) {
//            System.out.println(integer);
//        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list); // [10, 20, 30, 20]
//        System.out.println(list.get(0)); //or
        System.out.println(list.getFirst()); //10
        System.out.println(list.getLast()); //30
        System.out.println(list.get(1)); //20
        System.out.println(list.size()); //3
        System.out.println(list.indexOf(1)); // -1
        System.out.println(list.lastIndexOf(20)); //3
        System.out.println(list.indexOf(20)); // 1
        System.out.println(list.subList(1, 3)); // [20, 30], from index to index but element of to index is not printed
        System.out.println(list.reversed()); // [20, 30, 20, 10]
        System.out.println(list); // [10, 20, 30, 20]

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
    }
}
