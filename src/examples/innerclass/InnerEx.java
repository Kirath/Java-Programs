package examples.innerclass;

public class InnerEx {
    class Inner{
        public void m1(){
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args) {
        InnerEx in = new InnerEx();
        InnerEx.Inner i = in.new Inner();
        InnerEx.Inner i2 = new InnerEx().new Inner();
        i2.m1();
        i.m1();
    }
}
