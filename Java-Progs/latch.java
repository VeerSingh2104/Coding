import java.util.concurrent.CountDownLatch;

class SomeThread_1 extends Thread{
    private CountDownLatch latch;

    public SomeThread_1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started thread: "+Thread.currentThread().getName());
        System.out.println("Ended thread: "+Thread.currentThread().getName());
        System.out.println("********************************************");
        latch.countDown();
    }
}


public class latch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch  = new CountDownLatch(4);
        SomeThread_1 thread1 = new SomeThread_1(latch);
        SomeThread_1 thread2 = new SomeThread_1(latch);
        SomeThread_1 thread3 = new SomeThread_1(latch);
        SomeThread_1 thread4 = new SomeThread_1(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        latch.await();
        System.out.println("Main Thread: "+Thread.currentThread().getName());
    }
}
