import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock {
    public static int counter = 1;
    static Lock l = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                l.lock();
                try{
                    for (int i=1;i<100000;i++){

                        lock.counter++;

                    }

                }finally {
                    l.unlock();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                l.lock();
                try{
                    for (int i=1;i<100000;i++){

                        lock.counter++;


                    }
                }finally {
                    l.unlock();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Counter: "+lock.counter);
    }
}
