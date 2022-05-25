class Parent {

    public Number printm(int x, int y){
        return x + y;
//        System.out.println(x + y);

    }

}

class Child extends Parent{
    @Override
    public Integer printm(int x, int y) {
        super.printm(x, y);
        return x * y;
    }
    //        System.out.println("This is child");

    /* This is method overloading */
    /*----------------------------------------------------------------*/
    public void findSum(int x, int y, int z){
        System.out.println("The sum is" + (x + y + z));
    }

    public void findSum(int x, float y){
        System.out.println("The sum is" + x + y);
    }
    /*------------------------------------------------------------------*/

}

public class Test {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c1 = new Child();
        p1.printm(6,7);
        c1.findSum(2,3, 4);
        c1.findSum(4, 5);

        System.out.println("This is parent class implementation : " + p1.printm(2, 3));
        System.out.println("This is child class implementation : " + p2.printm(3,4));
        System.out.println("This is child class implementation : " + c1.printm(4, 5));

    }
}