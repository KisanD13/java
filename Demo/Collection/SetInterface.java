package Demo.Collection;

import java.util.*;

public class SetInterface {
    // this support unique value
    static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set.size());
        for (Integer i : set) {
            System.out.print("HashSet " + i + " ");
        }
        System.out.println();

        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(10);
        for (Integer i : treeSet) {
            System.out.print("TreeSet " + i + " "); // printed in sorted form
        }

        System.out.println();
        Iterator<Integer> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
