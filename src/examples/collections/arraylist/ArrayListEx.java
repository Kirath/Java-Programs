package examples.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListEx {
    public static void main(String[] args) {
        Object arr[] = new Object[4];
        arr[0] = 10;
        arr[1] = 10.0;
        arr[2] = "S";
        System.out.println(arr[0].getClass());
        ArrayList<Object> a = new ArrayList<>();
        a.add(10);
        a.add('s');
        a.add(10.0);
        System.out.println(a.get(2).getClass());

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        arr2.add(0, 5);
        Collections.addAll(arr2, 1,2,3, 4, 5);
        ListIterator<Integer> itr = arr2.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next() + " ");
        }

        Collections.sort(arr2);
        System.out.println(arr2);
        /*-----------------------------------------------------------------------  */
//        Implemented queue using linked list
        LinkedList<Integer> que = new LinkedList<>();
        Collections.addAll(que, 1,2 ,3, 4, 5);
        que.offer(6);
        que.offerLast(10);
        ListIterator<Integer> itr2 = que.listIterator();
        while (itr2.hasNext()){
            System.out.print(itr2.next() + " " );

        }
        System.out.println();
        while (!que.isEmpty()){
            System.out.print(que.pollFirst() + " ");
        }
        System.out.println();
        /*-----------------------------------------------------------------------  */
//        Stack using LinkedList
        LinkedList<Integer> stack = new LinkedList<>();
        Collections.addAll(stack, 1,2 ,3, 4, 5, 6, 10);
        while (!stack.isEmpty()){
            System.out.print(stack.pollLast() + " ");
        }



    }
}
