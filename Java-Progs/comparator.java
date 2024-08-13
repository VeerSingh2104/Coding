import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data_4<K,V>{
    private K key;
    private V value;

    public Data_4(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data_4{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class comparator {
    public static void main(String[] args) {
        Set<Data_4<Integer,String>> set = new TreeSet<>();
        set.add(new Data_4<>(1,"Veer"));
        set.add(new Data_4<>(2,"Ashley"));
        set.add(new Data_4<>(3,"Mike"));
        set.add(new Data_4<>(4,"John"));
        set.add(new Data_4<>(1,"Veer"));
        set.add(new Data_4<>(5,"John"));

        for (Data_4 data: set){
            System.out.println(data);
        }
    }
}
