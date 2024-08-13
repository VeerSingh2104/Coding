import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_1 {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Veer");
//        set.add("Phalak");
//        set.add("Satyansh");
//        set.add("Ashu");
//        set.add("Veer");
//        for (String name : set) {
//            System.out.println(name);
//        }
//        System.out.println(set.contains("veer"));


//        Lecture - 2
        Set<String> set = new TreeSet<>();
        for (int i=30;i>=0;i--)
        {
            set.add("A"+i);
        }
        for (String x:set){
            System.out.println(x);
        }
    }
}
