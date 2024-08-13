class Data_3<K,V>{
    private K key;
    private V value;

    public Data_3(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public <N extends Number ,E> void display(N number, E element){
        System.out.println("Number : "+number+" Element : "+element);
    }
}
public class gen_3 {
    public static void main(String[] args) {
        Data_3<Integer,String> data = new Data_3<>(1, "Veer");
        data.display(25.5254 ,'@');
    }
}
