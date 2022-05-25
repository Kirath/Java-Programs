import java.util.HashMap;

class Node{
    int val;
    Node next;
    Node prev;
    HashMap<Integer,Node> mp = new HashMap<>();
    public Node(){};
    public Node(int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
    public void add(int temp, Node head, Node tail){
        if (mp.containsKey(temp)){
            mp.remove(temp);
        }

        else if (mp.size() == LRUImplementor.capacity) {
            System.out.println("tail prev :" + tail.prev.val);
            mp.remove(tail.prev.val);

            LRUCache.remove(tail.prev);

        }
        Node t = new Node(temp, null, null);
        LRUCache.insert(t, head);
        mp.put(temp, t);

        }


    public int get(int key, Node head){
//        System.out.println("size of map :" + mp.toString());
        if (mp.containsKey(key)) {
            Node t = mp.get(key);
            mp.remove(key);
            LRUCache.remove(t);
            Node n = new Node(key, null, null);
            LRUCache.insert(n, head);
            mp.put(n.val, n);
            return n.val;
        }
        else
            return -1;
    }

}

abstract class LRUCache{
    public static void insert(Node node, Node head){
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;

    }
    public static void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }
}
public class LRUImplementor {
    static int capacity = 2;
    public static void main(String[] args) {
        Node head = new Node(0,null,null);
        Node tail = new Node(0,null,null);
        head.next = tail;
        tail.prev = head;
        Node ob = new Node();
        ob.add(1,head, tail);
        ob.add(2, head, tail);
        System.out.println(ob.mp.toString());
        System.out.println(ob.get(1, head));
        System.out.println(ob.mp.toString());
        ob.add(3, head, tail);
        System.out.println(ob.mp.toString());
        System.out.println(ob.get(2, head));




    }
}
