package examples.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(null, null);
        mp.put(1, 2);
        mp.put(2, 3);

//        Iterator<Map.Entry<Integer, Integer>> itr = mp.entrySet().iterator();
        Set<Map.Entry<Integer,Integer>> s1 = mp.entrySet();
        Iterator itr = s1.iterator();

        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println("Key" + m1.getKey() + "Val " + m1.getValue());
        }
    }
}
