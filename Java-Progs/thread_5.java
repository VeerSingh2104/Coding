//Synchronized methods
class Brackets_1{
    synchronized public static void  generate() {
            for (int i = 1; i <= 20; i++) {
                if (i <= 10) {
                    System.out.print('[');
                } else {
                    System.out.print(']');
                }
            }
            System.out.println();
    }
}

public class thread_5 {
    public static void main(String[] args) {
        Brackets_1 brackets1 = new Brackets_1();
        Brackets_1 brackets2 = new Brackets_1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long starttime = System.currentTimeMillis();
                for (int i=0;i<=4;i++){
                    Brackets_1.generate();
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
                    Brackets_1.generate();
                }
                long endtime = System.currentTimeMillis();
                System.out.println("The time required by thread 2: "+(endtime-starttime));
            }
        }).start();
    }
}
