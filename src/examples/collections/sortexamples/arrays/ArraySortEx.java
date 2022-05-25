package examples.collections.sortexamples.arrays;

import java.util.Arrays;
import java.util.Comparator;
class MyComaprator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
public class ArraySortEx{

    public static void main(String[] args) {
        int[] arr = {10, 12, 9,4, 2, 0};
        Integer arr2[] =  {10, 12, 9,4, 2, 0};
        System.out.println("Array before sorting ->" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sorting ->" + Arrays.toString(arr));
        System.out.println("Element found at index " + Arrays.binarySearch(arr, 2));
        Arrays.sort(arr2, new MyComaprator());
        System.out.println("Object Array can be sorted in customised sorting order ->" + Arrays.toString(arr2));
        System.out.println("Element found at index " + Arrays.binarySearch(arr2, 2, new MyComaprator()));
    }

}
