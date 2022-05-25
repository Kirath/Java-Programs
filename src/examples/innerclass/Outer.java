package examples.innerclass;

public class Outer {
    class Inner{
        public void m1(){
            System.out.println("Inner class method");
        }
    }
    public void m1(){
        Inner i = new Inner();
        i.m1();
        System.out.println("Outer class method");
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.m1();
        Outer.Inner i = o.new Inner();
        i.m1();
    }
}
