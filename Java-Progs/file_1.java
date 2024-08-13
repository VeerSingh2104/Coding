import java.io.File;

public class file_1 {
    public static void main(String[] args) {
        File file = new File("folder\\subfolder\\anotherfolder");
        if (file.mkdirs()){
        System.out.println("Folder created");
        }else {
            System.out.println("Folder already exists!");
        }
    }
}
