import java.io.*;

public class file_7_readobject {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("Vehicle.dat")) {
            try(ObjectInputStream obj = new ObjectInputStream(fis)){
                file_7_Vehicle v1 = (file_7_Vehicle) obj.readObject();
                file_7_Vehicle v2 = (file_7_Vehicle) obj.readObject();
                System.out.println(v1);
                System.out.println(v2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
