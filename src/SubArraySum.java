import java.util.*;

public class SubArraySum {
    public List<Integer> subSum(ArrayList<Integer> arr, int B) {

        int n = arr.size();
        int p1 = 0, p2 = 1;
        int sbsm = 0;
        sbsm += arr.get(p1);
        while (p1 < p2 && p2 < n) {
            if (sbsm == B) {
                return arr.subList(p1, p2);
            }
            if (sbsm < B) {
                sbsm += arr.get(p2);
                p2++;
            }
            else {
                sbsm -= arr.get(p1);
                p1++;
            }
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        SubArraySum ob1 = new SubArraySum();
        ArrayList<Integer> inp1 = new ArrayList<>();
        ArrayList<Integer> inp2 = new ArrayList<>();
        Collections.addAll(inp1, 1, 2, 3,4,5);
        Collections.addAll(inp2, 5,10, 20, 100, 105);
        System.out.println(ob1.subSum(inp1, 5));
        System.out.println(ob1.subSum(inp2, 110));
    }
}
