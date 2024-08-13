import java.io.*;

public class file_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line = be.readLine())!=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(e);
        } finally {
            be.close();
        }
    }
}
