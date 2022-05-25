import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class AllCombs {
    public void printElements(LinkedList<Integer> q, boolean flag){
        int i = 0;
        StringBuilder sb = new StringBuilder();
        if (flag)
            i = 1;
        while (i < q.size()) {
            sb.append(q.get(i));
            i++;
        }
        System.out.println(Integer.parseInt(sb.toString()));

    }
    public void findAll(int num){
        int x = num;
        LinkedList<Integer> q = new LinkedList<>();
        int r;
        while (x > 0){
            r = x % 10;
            q.add(r);
            x /= 10;
        }
        Collections.reverse(q);
        System.out.println(q);

        for(int i = 0; i< q.size() - 1;i++){
            Integer temp = q.removeFirst();
            q.addLast(temp);

            if (q.getFirst() == 0) {
                printElements(q, true);
            }
            else
                printElements(q, false);

        }
    }
    public static void main(String[] args) {
        AllCombs ob = new AllCombs();
        ob.findAll(908);

    }
}
