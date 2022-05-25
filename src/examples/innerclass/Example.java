package examples.innerclass;

class Outer1{
    static int x = 10;
    private int y = 20;
    class Inner{
        public void m1(){
            System.out.println("Inner class method");
            System.out.println("Accessing static content of outer class from inner class " + x);
            System.out.println("Accessing non static content of outer class from inner class " + y);
        }
    }

}
public class Example {
    public static void main(String[] args) {
        Outer1.Inner i = new Outer1().new Inner();
        i.m1();

    }
}
