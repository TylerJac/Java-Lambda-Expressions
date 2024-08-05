import java.util.function.Function;
public class UpperCase {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("my name bob"));
    }
}
