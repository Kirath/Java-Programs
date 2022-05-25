package examples.abstractExamples;

abstract class Vehicle{
    int c;
    Vehicle(){
        this.c = 0;
    }
    public abstract void start();
    public void stop(){
        System.out.println("Hey this a method of abstract class");
    }
}
public class AbsEx extends Vehicle{
    @Override
    public void start() {
        System.out.println("Hi child class is providing implementation of abstract method");
    }

    public static void main(String[] args) {
        AbsEx x = new AbsEx();
        AbsEx ab = new AbsEx();
        System.out.println(x.c);
        ab.start();
        ab.stop();

    }
}
