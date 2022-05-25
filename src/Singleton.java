class SingletonLoader {
    private static SingletonLoader instance = null;

    private SingletonLoader() {
    }

    public static SingletonLoader getInstance() {
        if (instance == null)
            instance = new SingletonLoader();
        return instance;
    }

}
public  class Singleton{
    public static void main(String[] args) {
        SingletonLoader ob = SingletonLoader.getInstance();
        SingletonLoader ob2 = SingletonLoader.getInstance();
        System.out.println(ob + " " + ob2);
    }
}
