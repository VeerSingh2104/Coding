public class runhehe {
    public static void main(String args[]){
        Thread thread1 = new Thread(()->{
            System.out.println("Hello World");
        });
        thread1.start();


        Thread thread2 = new Thread(()->{
           int a = 2;
           int b = 4;
           int c=a+b;
           System.out.println("A="+a);
           System.out.println("B="+b);
           System.out.println("C="+c);
        });
        thread2.start();
    }
}
