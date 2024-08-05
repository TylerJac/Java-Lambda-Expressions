public class Subtraction {
    @FunctionalInterface
    public interface Calculator {
        int calculate(int a, int b);
    }

    public static int subtract(int a, int b, Calculator calculator) {
        return calculator.calculate(a, b);
    }

    public static void main(String[] args) {
        int result = subtract(10, 5, (a, b) -> a - b);
        System.out.println(result);
    }
}