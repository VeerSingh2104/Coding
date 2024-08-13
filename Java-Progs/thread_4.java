//Synchronized methods
class Brackets{
    public void  generate() throws InterruptedException{
        //Synchronized block (More efficient)
        synchronized (this){
            for (int i = 1; i <= 20; i++) {
                Thread.sleep(5);
                if (i <= 10) {
                    System.out.print('[');
                } else {
                    System.out.print(']');
                }
            }
            System.out.println();
        }
        for (int i=0;i<10;i++){
            Thread.sleep(10);
        }
    }
}

public class thread_4 {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long starttime = System.currentTimeMillis();
                for (int i=0;i<=4;i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endtime = System.currentTimeMillis();
                System.out.println("The time required by thread 1: "+(endtime-starttime));
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                long starttime = System.currentTimeMillis();
                for (int i=0;i<=4;i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endtime = System.currentTimeMillis();
                System.out.println("The time required by thread 2: "+(endtime-starttime));
            }
        }).start();
    }
}
