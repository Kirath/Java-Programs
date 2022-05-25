package examples.exceptions;

public class ExpEx2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/ 0);
        }
        catch (ArithmeticException e){
            System.out.println(10/ 0);
        }
        finally {
            System.out.println("End of program");
        }
    }
}
