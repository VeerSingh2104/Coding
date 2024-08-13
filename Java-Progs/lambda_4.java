import java.util.function.IntPredicate;
public class lambda_4 {
    public static void main(String[] args) {
        IntPredicate lessthan18 = value -> (value < 18);
        IntPredicate Morethan18 = value -> ( value > 18 );
        System.out.println((lessthan18).or(Morethan18).negate().test(10));
    }
}
