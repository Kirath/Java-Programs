package examples.interfaceEx;

interface ExampleInterface{
   int x = 0;
}

public class ExampleIn implements ExampleInterface {
    public static void main(String[] args) {
        ExampleInterface a = new ExampleIn();
//        can't modify interface variables as they are final
//        x = 10;
        System.out.println(x);

    }
}


