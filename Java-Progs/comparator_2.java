import javax.xml.crypto.Data;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data_5<K extends Integer, V extends String>{
    private K key;
    private V value;

    public Data_5(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data_5{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class comparator_2 {
    public static void main(String[] args) {
        Comparator<Data_5<Integer,String>> COMPARE_KEY = new Comparator<Data_5<Integer, String>>() {
            @Override
            public int compare(Data_5<Integer, String> obj1, Data_5<Integer, String> obj2) {
                if(obj1.getKey()<obj2.getKey()){
                    return -1;
                } else if (obj1.getKey()> obj2.getKey()) {
                    return 1;
                }
                return 0;
            }

        };

        Set<Data_5<Integer,String>> set_2 = new TreeSet<>(COMPARE_KEY);
        set_2.add(new Data_5<>(1,"Veer"));
        set_2.add(new Data_5<>(2,"Monty"));
        set_2.add(new Data_5<>(3,"Mishti"));
        set_2.add(new Data_5<>(4,"Phalak"));
        set_2.add(new Data_5<>(1,"Veer"));


        for (Data_5 data : set_2){
            System.out.println(data);
        }
    }
}
