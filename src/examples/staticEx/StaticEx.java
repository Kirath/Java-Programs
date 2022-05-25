package examples.staticEx;

public class StaticEx {
    static int x;
    int y;
    public static void m1(){
        x= 10;
        System.out.println("Value of x is " + x);
//        non static content can't be accessed from static area
//        y =10;
    }
    public static void m1(int x){
        StaticEx.x = x;
        System.out.println("Value of x is " + x);
    }
    public void m2(){
        y = 20;
//        static content can be accessed from anywhere
        x = 40;
    }
}
