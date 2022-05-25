import java.util.HashMap;

public class HashEx {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 2);
        mp.put(3, 2);
        mp.put(4, 0);
        for(Integer k : mp.keySet())
            System.out.println(k + " " +  mp.get(k));
    }
}
