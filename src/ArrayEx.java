
public class ArrayEx {
    int x;
    static int y;
    public void m1(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        int z = 10, q= 20;
        System.out.println(z > q ? true: false);
        ArrayEx ob = new ArrayEx();
        ArrayEx ob1 = new ArrayEx();
        ob.x = 100;
        ArrayEx.y = 200;
        ob.m1();
        ob1.m1();

//        System.out.println();
        Number arr[] = new Number[6];
        arr[0] = new Integer(10);
        arr[1] = new Double(10.5);
        arr[2] = new Float(10);
//        for (Number x : arr){
//            System.out.println(x);
//        }
        Number arr2[] = {1, 2};
//        arr2 = arr;
        arr = arr2;
        for (Number x : arr){
            System.out.println(x);
        }

        System.out.println(arr instanceof Number[]);


    }
}
