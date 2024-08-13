import java.util.Random;
import static java.lang.Thread.sleep;



public class thread_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    try {
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        }); //another way of implementing threads in java is that we can use of runnable interfaces that avoids
        //making use of an external function in the class.

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random1 = new Random();
                for (int j=65;j<=91;j++){
                    try {
                        sleep(random1.nextInt(1500));
                        System.out.println((char)j);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }
        });
        thread2.start();
        thread1.start();
        thread1.join();
        thread2.join();


    }
}
