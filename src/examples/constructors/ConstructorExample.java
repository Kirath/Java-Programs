package examples.constructors;

public class ConstructorExample {
    protected ConstructorExample(){
//        can't call same class constructor here as it will lead recursive contructor calling
//        this();
        super();
        System.out.println("No param constructor");
    }
    public ConstructorExample(int i){
        this();
        System.out.println("Integer param constructor");
    }
    public ConstructorExample(double d){
        this(10);
        System.out.println("Double param constructor");
    }

    public static void main(String[] args) {
        ConstructorExample ob1 = new ConstructorExample();
        ConstructorExample ob2 = new ConstructorExample(10);
        ConstructorExample ob3 = new ConstructorExample(10.000);
    }

}
