
public class    Lamba {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Statement1");
            System.out.println("Statement2");
        });
        thread.start();
    }
}
