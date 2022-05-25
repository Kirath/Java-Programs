package examples.runtime;

public class RuntimeEx {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory());
        r.gc();
    }
}
