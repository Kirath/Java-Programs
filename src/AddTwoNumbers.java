import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbers {
    public static List<Integer> add(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int s1, int s2){


        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(s1, 0));
        int ptr2 = s2 - 1;
        int ptr1 = s1 - 1;
        int carry = 0;
        int sm;
        while (ptr2 >= 0){
            System.out.println(arr1.get(ptr1) + " " + arr2.get(ptr2));
            sm = arr1.get(ptr1) + arr2.get(ptr2) + carry;
            carry = sm / 10;
            sm %= 10;
            ans.set(ptr1, sm);
            ptr1--;
            ptr2--;
        }
        while (ptr1 >= 0){
            sm = arr1.get(ptr1) + carry;
            carry  = sm / 10;
            sm %= 10;
            ans.set(ptr1, sm);
            ptr1--;
        }
        if (carry > 0)
            ans.add(0, carry);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1, 1,2,3, 4);
        ArrayList<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2, 9, 9, 9, 9);
        int n = arr1.size(), m = arr2.size();
        if (n >= m)
            System.out.println(add(arr1, arr2, n, m));
        else
            System.out.println(add(arr2, arr1, m, n));
    }
}
