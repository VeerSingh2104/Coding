import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Data_2{
    public <E> void printlistdata(List<E> list) {
        for (E element: list) {
            System.out.println(element);
        }
    }

    public <E> void printArraydata(E[] array){
        for (E element: array){
            System.out.println(element);
        }
    }
}

public class gen_2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        new Data_2().printlistdata(list);
//        List<String> list2 = new LinkedList<>();
//        list2.add("One");
//        list2.add("Two");
//        new Data_2().printlistdata(list2);

        String[] string_arr = {"One","Two","Three","four"};
        new Data_2().printArraydata(string_arr);
        Integer[] int_arr = {1,2,3,4,5};
        new Data_2().printArraydata(int_arr);
    }
}
