package examples.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComprator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1.compareTo(o2);
//         return - o1.compareTo(o2);
        return o2.compareTo(o1);
//        o1 -> object to be inserted
//        o2 -> object already present
        /* +ve value means o1 will come after o2
            -ve value means o1 will before o2
        * */
    }
}
public class CompareEx extends MyComprator {
    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>(new MyComprator());
        tSet.add(10);
        tSet.add(0);
        tSet.add(-1);
        tSet.add(89);
        tSet.add(2);
        System.out.println(tSet);

        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        System.out.println("A".compareTo("A"));
    }
}
