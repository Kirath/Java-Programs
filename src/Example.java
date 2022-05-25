class Test1{
    static int t;
    static int[] a;
    public void m1(){
        System.out.println("This is in function :" + t);
    }

}
public class Example {
    public static void main(String[] args) {
        System.out.println(Test1.t);
        Test1 t = new Test1();
        t.m1();
        System.out.println(Test1.a[0]);
    }

}
