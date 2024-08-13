import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class file_7_main {
    private static int x = 0;
    public static void main(String[] args) {
        file_7_Vehicle bike= new file_7_Vehicle("Bike",7248);
        file_7_Vehicle car = new file_7_Vehicle("Car", 5421);

        try(FileOutputStream fos = new FileOutputStream("vehicle.dat")) {
            try(ObjectOutputStream objb = new ObjectOutputStream(fos)){
                objb.writeObject(bike);
                objb.writeObject(car);
                System.out.println("File operation was successful!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
