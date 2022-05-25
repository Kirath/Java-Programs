package examples.interfaceEx;

interface Bird{
    default void m1(){
        System.out.println("Hi this examples.interfaceEx.Bird interface");
    }
    void m2();
}

class Duck implements Bird{
    @Override
    public void m2(){
        System.out.println("Hi this is duck class");
    }

    public void m3(){
        System.out.println("examples.interfaceEx.Duck method");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Bird b = new Duck();
//        examples.interfaceEx.Bird b1 = new examples.interfaceEx.Bird() {
//            @Override
//            public void m2() {
//                System.out.println("This method is being overridden");
//            }
//        };
//        b1.m1();
//        b1.m2();
        b.m1();

        Duck d = new Duck();
        d.m1();
        d.m2();
        b.m1();
        b.m2();
    }
}
