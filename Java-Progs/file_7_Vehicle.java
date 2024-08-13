import java.io.Serializable;

public class file_7_Vehicle implements Serializable {
    private String type;
    private int number;

    public file_7_Vehicle(String type, int number) {
        this.type = type;
        this.number=number;
    }

    @Override
    public String toString() {
        return "file_7_Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
