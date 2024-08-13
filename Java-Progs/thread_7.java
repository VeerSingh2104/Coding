public class thread_7 {
    public static int balance = 0;
    synchronized public void withdraw(int amount) {
        if(balance<=0){
            System.out.println("Waiting for amount to be updated...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Withdrawl Interrupted");
                return;
            }
        }
        if((balance-amount)<0){
            System.out.println("Balance too low for withdrawl");
            return;
        }
        balance = balance-amount;
        System.out.println("The current balance is: "+balance);
    }
    public boolean deposit(int amount){
        synchronized (this){
            if(amount>0){
                System.out.println("We are depositing the amount in the bank");
                balance = balance+amount;
                notify();
                return true;
            }else {
                System.out.println("Invalid Amount");
                return false;
            }
        }
    }
    public static void main(String[] args) {
        thread_7 thread7 = new thread_7();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread7.withdraw(1000);
            }
        });
        thread1.setName("Thread 1");
        thread1.start();




        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(thread7.deposit(1000)){
                    System.out.println("Transaction completed");
                }else {
                    //thread7.interrupt();
                    System.out.println("Transaction Failed");
                }
            }
        });
        thread2.setName("Thread 1");
        thread2.start();
    }
}




//interrupt() does two things 1)Handles exceptions
