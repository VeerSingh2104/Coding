import java.sql.SQLOutput;

interface Data_6{
    public int demo(int x, int y);
}

public class lambda_2 {
    public static void main(String[] args) {
        Data_6 data = (a,b)-> {
            System.out.println("Value of y: "+b);
            System.out.println("Value of x will be returned by the method");
            return a;
        };
        System.out.println(data.demo(10,25));
    }
}
