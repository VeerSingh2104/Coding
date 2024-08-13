import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
    private String name;

    public SomeThread(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public void run(){
        System.out.println("Started Value: "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ended thread: "+name);
    }
}



public class pool_1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        SomeThread thread1 = new SomeThread("Thread01");
        SomeThread thread2 = new SomeThread("Thread02");
        SomeThread thread3 = new SomeThread("Thread03");
        SomeThread thread4 = new SomeThread("Thread04");
        SomeThread thread5 = new SomeThread("Thread05");
        SomeThread thread6 = new SomeThread("Thread06");
        SomeThread thread7 = new SomeThread("Thread07");
        SomeThread thread8 = new SomeThread("Thread08");
        SomeThread thread9 = new SomeThread("Thread09");
        SomeThread thread10 = new SomeThread("Thread10");
        SomeThread thread11 = new SomeThread("Thread11");
        SomeThread thread12 = new SomeThread("Thread12");

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);


        executorService.shutdown();
    }
}
