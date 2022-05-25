package examples.threads;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread MyRunnable method");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class RunnableEx {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        r.run(); //no new thread created, run() will be call as normal method
        Thread t1 = new Thread();
        t1.start();// new thread will be created and thread class run() will be called which has no implementation
        Thread t2 = new Thread(r);
        t2.start(); // new thread will be created and MyRunnable class run() will be called which has implementation
//        t2.run();
//        r.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");

        }
        System.out.println(Thread.currentThread().getName());

    }
}
