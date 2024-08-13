public class thread_3 {
    public static int counter = 1;

    public static void main(String[] args) throws  InterruptedException{
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1 ; i<=100000 ; i++){
                    thread_3.counter++;
                }
                System.out.println("The loop in thread 1 is over");
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1 ; i<=100000 ; i++){
                    thread_3.counter++;
                }
                System.out.println("The loop in thread 2 is over");
            }
        }).start();

        Thread.sleep(200);
        System.out.println(thread_3.counter);
    }
}
