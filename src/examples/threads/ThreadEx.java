package examples.threads;
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.yield();
            System.out.println("child thread");
        }

    }
}
public class ThreadEx {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start(); /* new thread will be created */
//        t.run(); /* no new thread will be created. single main thread will do the job*/
        for (int i = 0; i < 10; i++) {

            System.out.println("main thread");

        }

    }
}
