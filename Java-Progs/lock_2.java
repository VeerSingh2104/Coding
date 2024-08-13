import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock_2 {
    static Lock lock1 = new ReentrantLock();
    static  Lock lock2 = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flaglock1= false;
                boolean flaglock2 = false;
                while(true){
                    try {
                        flaglock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
                        flaglock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        if(flaglock1){
                            System.out.println("Thread1, lock1");
                            lock1.unlock();
                        }
                        if(flaglock2){
                            System.out.println("Thread1, lock2");
                            lock2.unlock();
                        }
                        if(flaglock1 && flaglock2){
                            break;
                        }
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flaglock1= false;
                boolean flaglock2 = false;
                while(true){
                    try {
                        flaglock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
                        flaglock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        if(flaglock2){
                            System.out.println("Thread2, lock2");
                            lock2.unlock();
                        }
                        if(flaglock1){
                            System.out.println("Thread2, lock1");
                            lock1.unlock();
                        }
                        if(flaglock1 && flaglock2){
                            break;
                        }
                    }
                }

            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main Thread ");
    }
}
