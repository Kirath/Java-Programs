class P{
    public static void main(String[] args) {
        System.out.println("Parent main called");
    }
}

public class Example2 extends P {
    public static void main(String[] args) {
        System.out.println("Child main called");
        System.out.println(-10/0.0);
        System.out.println(0/0.0);
    }

}
