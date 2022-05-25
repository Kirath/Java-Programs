abstract class Test2{
    private int x;
    public Test2(){
        this.x = 0;
    }

    public int getX() {
        return x;
    }

    public abstract void m1();
    public abstract void m2();
}

class Test3 extends Test2 {
    private int y;
    public Test3(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void m1(){
        System.out.println(super.getX() + " " +  this.getY());
    }
    public void m2(){}
    private void m3(){}

}
public class AbstractEx {
    public static void main(String[] args) {
        Test3 t = new Test3(10);
        t.m1();
    }
}
