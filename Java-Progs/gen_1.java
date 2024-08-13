/*  T - Type
    E - Element
    K - Key
    N - Number
    V - Value
 */

class Data_1<K, V>//Generic Class
{
    private K key;
    private V value;

    public Data_1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public <E, N> void display(E element, N number)//Generic Method
    {
        System.out.println("Element : "+element+" Number : "+number);
    }
}


class Main{
    public static void main(String[] args) {
        Data_1<Integer, String> data = new Data_1<>(10,"Veer");
        System.out.println("Key : "+data.getKey()+" Value : "+data.getValue());
        data.display(40.235478962145,40);
    }
}