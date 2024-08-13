import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class  Code implements Comparable<Code>{
    private String sectionName;
    private String lectureNo;

    public Code(String sectionName, String lectureNo) {
        this.sectionName = sectionName;
        this.lectureNo = lectureNo;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionName='" + sectionName + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionName.concat(lectureNo);
        String code2 = o.getSectionName().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(sectionName, code.sectionName) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionName, lectureNo);
    }
}


public class map_1  {
    public static void main(String[] args) {
//        String x1 = "Veer";
//        x1+="Phalak";
//        String x2 = "VeerPhalak";

//        System.out.println(x1.hashCode());
//        System.out.println(x2.hashCode());
//        System.out.println(x1.equals(x2));

//
//        Code code1 = new Code("01","01");
//        Code code2 = new Code("01","01");
//        System.out.println(code1.equals(code2));
//        System.out.println(code1.hashCode());
//        System.out.println(code2.hashCode());

        //Searching in maps
//        for (Code key : map){
//            if (map.get(key).equals("Veer")){
//                code=key;
//                break;
//            }
//        }
//        System.out.println(code);

    }
}
