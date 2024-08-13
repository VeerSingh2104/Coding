public class Main_1 {
    public static int counter1 = 0;

    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    counter1++;
                }
            }
        });
        thread1.start();
        thread1.join();
        System.out.println("Counter 1: "+counter1);
    }
}

//thread1 first then main thread.
//not a good programming (No multithreading)