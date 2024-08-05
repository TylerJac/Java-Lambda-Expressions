public class Multiplication {
    @FunctionalInterface
    public interface Multiplier {
        int multiply(int a, int b);
    }

    public static int multiply(int a, int b, Multiplier multiplier) {
        return multiplier.multiply(a, b);
    }

    public static void main(String[] args) {
        Multiplier multiply = (a, b) -> a * b;

        System.out.println(multiply(5, 10, multiply));
    }
}
