import java.util.*;

class Data{
    String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class lambda_1 {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Veer"));
        list.add(new Data("John"));
        list.add(new Data("Pooja"));
        list.add(new Data("Gia"));
        list.add(new Data("Edd"));

        //Collections.sort(list, (o1,  o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(list, (o1,  o2) ->{
            if (o1.getName().length() < o2.getName().length()){
                return -1;
            }else if (o1.getName().length() > o2.getName().length()){
                return 1;
            }else {
                return 0;
            }

        });
        for (Data temp: list){
            System.out.println(temp);
        }

    }
}
