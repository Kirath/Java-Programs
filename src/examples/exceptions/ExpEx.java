package examples.exceptions;

public class ExpEx {
    public static void main(String[] args) {
        try{
            System.out.println("In try");
            System.exit(0);
            return;
        }
        catch (Exception e){
            System.out.println("In catch");
        }

        finally {
//            Finally will be executed even if return statement is there in try
            System.out.println("In finally");
        }
    }
}
