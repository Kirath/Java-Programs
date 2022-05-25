package examples.main;

public class MainEx {
    public static void main(String[] args) {
        System.out.println("MainEx main method called");
    }
}
class MainsChild extends MainEx{
    public static void main(String[] args) {
        System.out.println("MainsChild main called");
    }
}
