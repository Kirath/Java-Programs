import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSumSub {
    public int maximuSum(List<Integer> arr){
        int maxSum = 0;
        int currSum = 0;
        for(int i = 0; i < arr.size();i++){
            currSum += arr.get(i);
            if (currSum <= 0){
                currSum = 0;
            }
            else{
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumSub ob = new MaxSumSub();
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> arr2 = new ArrayList();
        Collections.addAll(arr, -1,-2, 1, 3);
        Collections.addAll(arr2, 1,2, 3, 4);
        System.out.println(ob.maximuSum(arr));
        System.out.println(ob.maximuSum(arr2));
    }
}
