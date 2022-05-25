package examples.proexcaller;
import examples.proex.ProtectedEx;


//class CallPro extends ProtectedEx{
//    public void m2(){
//        System.out.println("In child class");
//    }

//}
public class CallerPro extends ProtectedEx {
    public static void main(String[] args) {
        ProtectedEx p = new ProtectedEx();
        CallerPro c = new CallerPro();
        //p.m1(); wont work as method m1 is protected
        c.m1();
    }

}
