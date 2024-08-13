import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Data_7<S> {
    private String name;

    public Data_7(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data_7{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

public class lambda_3 {
    public static void main(String[] args) {




        Comparator<Data_7<String>> COMPARE_KEY = new Comparator<Data_7< String>>() {
            @Override
            public int compare(Data_7<String> o1, Data_7<String> o2) {
                if(o1.getName().length() < o2.getName().length()){
                    return -1;
                } else if (o1.getName().length()>o2.getName().length()) {
                    return 1;
                }else {
                    return 0;
                }
            }
        };


        List<Data_7<String>> list = Arrays.asList(new Data_7<String>("Veer"), new Data_7<String>("Raj"), new Data_7<String>("Phalak"),new Data_7<String>("Ed")); //another way of creating a list
        list.sort(COMPARE_KEY);
        list.forEach(temp -> System.out.println(temp.getName()));
    }
}
