package examples.finalExamples;

public final class FoinalEx2 {
//    final class methods are final by default
    final int x = 0;
    public void m1(){
        System.out.println();
    }

    public static void main(String[] args) {
        FoinalEx2 f = new FoinalEx2();
        System.out.println(f.x);
    }

}
