import static java.lang.Thread.sleep;
class Mycounter{
    private int threadno;

    public Mycounter(int threadno){
        this.threadno=threadno;
    }
    public void count() throws InterruptedException {
        for (int i=0;i<5;i++){
            sleep(100); //give an interval of 0.5 seconds in between every iteration.
            System.out.println("Thread no: "+threadno+" and iteration no: "+i);
        }
    }
}


public class thread {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
//        Mycounter counter1 = new Mycounter(1);
//        Mycounter counter2 = new Mycounter(2);
        new Mycounter(1).count();//instance object

        System.out.println("***************************************");
        new Mycounter(2).count();
        System.out.println("***************************************");
        new Mycounter(3).count();
        System.out.println("***************************************");
        Thread mycounter = new Thread(()-> {
            for(int i=0;i<8;i++){
                System.out.println("Hello world (used lamda expression)");
            }
        });
        mycounter.start();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
