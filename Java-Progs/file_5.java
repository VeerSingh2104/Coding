import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("test.txt"))){
            String line;
            while(sc.hasNext()){
                line=sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
