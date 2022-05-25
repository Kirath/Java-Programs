package examples.finalExamples;

public class FinalEx {
//    final variables needs initialization
//    final instance variables needs initialization before constructor compilation
    final int x;

    {
        x = 10;
    }
    public final void m1(){
        System.out.println("Hello World");
    }
    public  void m2(){
        System.out.println("Hello non final method");
    }

    public static void main(String[] args) {
        final int x = 0;
        System.out.println(x);
        FinalEx p = new FinalEx();
        FinalChild c = new FinalChild();
        FinalChild c1 = new FinalChild();
        FinalEx p1 = new FinalChild();
//        FinalChild c1 = new examples.finalex.FinalEx();
        c.m2();
        p.m1();
        p.m2();
        c1.m2();
        p1.m2();
    }
}

class FinalChild extends FinalEx{
    //can't override final method
//    public void m1(){
//
//    }

    @Override
    public void m2() {
        System.out.println("Hello child can override non final method");
    }
}
