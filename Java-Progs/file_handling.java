import java.io.File;
import java.io.IOException;

public class file_handling {
    public static void main(String[] args) throws IOException {
        //filename is case-sensitive
        //path is not case-sensitive
        File file = new File("src\\veer.txt");
        file.createNewFile();
        System.out.println("File created!");
    }
}
