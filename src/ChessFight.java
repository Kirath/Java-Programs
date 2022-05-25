import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ChessFight {
    public static long getPotentialWinner(List<Integer> arr, long k){
        Stack<Integer> stk = new Stack<>();
        stk.push(arr.get(0));
        for(int i = 1 ; i < arr.size(); i++){
            int top = stk.peek();
//            System.out.println(stk.toString());
//            System.out.println(top +" " +  arr.get(i));
            if (top > arr.get(i)){
                stk.pop();
                stk.push(arr.get(i));
                if (stk.size() == k){
                    return top;
                }
            }
            else{
                stk.push(arr.get(i));
            }

        }
        return stk.peek();
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 3, 2, 4, 5);
        System.out.println(getPotentialWinner(arr, 2));
        ArrayList<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2, 3, 2, 1, 4);
        System.out.println(getPotentialWinner(arr2, 2));




    }
}
