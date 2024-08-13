import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//Use of try with resources closes the file automatically

//example of try with resources : try(BufferedWriter be = new BufferedWriter(new FileWriter("test.txt",true)))  {}
public class file_3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter be = null;
        try {
            be = new BufferedWriter(new FileWriter("test.txt", true));
            be.newLine();
            be.write("Author: ");
            be.write("Veer");

            System.out.println("File write operation was successful!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(e);
        } finally {
            be.close();
        }
    }
}
