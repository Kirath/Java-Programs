package examples.exceptions;

public class ExceptionEx  {
    public static void main(String[] args) {
        try{
            System.out.println(10/ 0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getMessage());
//            System.out.println(0/ 0);
        }
        finally {
            System.out.println("end of program");
        }

    }
}
