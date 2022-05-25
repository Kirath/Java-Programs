package examples.interfaceEx;

interface A{
    void m1();
    void m2();

}
interface B{
    void m1();
    void m2(int i);
}
public class MethodEx implements A, B {
    @Override
    public void m1() {
        System.out.println("No need to implement m1 of interface A and B." +
                " Since they're same methods");
    }

    @Override
    public void m2() {
        System.out.println("m2 method of class A");
    }

    @Override
    public void m2(int i) {
        System.out.println("m2 method of class B");
    }

    public static void main(String[] args) {
        A a = new MethodEx();
        B b  = new MethodEx();
        a.m1();
        a.m2();
        b.m1();
        b.m2(2);

    }
}
