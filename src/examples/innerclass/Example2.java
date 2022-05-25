package examples.innerclass;
class Outer2{
    int x = 10;
    class Inner{
        int x = 100;
        public void m1(){
            System.out.println("inner class variable " + this.x);
            System.out.println("outer class variable " + Outer2.this.x);
        }

    }
}
public class Example2 {
    public static void main(String[] args) {
        Outer2.Inner i = new Outer2().new Inner();
        i.m1();
    }
}
