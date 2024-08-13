import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class queue_1 {
    public static void main(String[] args) {
        Queue queue = new ArrayBlockingQueue(5);
        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            queue.remove();
            queue.add(7);
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }



        System.out.println(queue);
    }
}
