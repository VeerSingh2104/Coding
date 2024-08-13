public class thread_6 {
    volatile public static int flag=0;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(true){
                    if(flag==0){
                        System.out.println(i+" Running...");
                        i++;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag=1;
                System.out.println("The value of flag and thread stopped ");
            }
        }).start();
    }
}
