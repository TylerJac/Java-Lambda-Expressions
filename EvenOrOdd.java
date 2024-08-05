import java.util.function.Predicate;
public class EvenOrOdd {
    public static void main(String[] args) {
        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> odd = n -> n % 2 != 0;

        System.out.println(even.test(10));
        System.out.println(odd.test(10));

        System.out.println(even.negate().test(10));
        System.out.println(odd.negate().test(10));
    }
}
