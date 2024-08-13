import static java.lang.Thread.sleep;

class Counter{
    private int threadno;

    public Counter(int threadno) {
        this.threadno = threadno;
    }
    public void count() throws InterruptedException {
        for(int i=0;i<5;i++){
            sleep(1000);
            System.out.println("Thread no = "+threadno+" ; i="+i);
        }
    }
}


public class sample {
    public static void main(String [] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        new Counter(1).count();
        System.out.println("****************************************");
        new Counter(2).count();
        System.out.println("****************************************");
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken = "+(endTime-startTime));
    }
}
