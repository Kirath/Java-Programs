package examples.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriotityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.offer(-10);
        minHeap.offer(-11);
        minHeap.offer(-1);
        minHeap.offer(-0);
        minHeap.offer(-9);
        System.out.println(minHeap);
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
    }
}
