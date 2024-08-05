public class Division {
    @FunctionalInterface
    public interface DivisionOperation {
        int divide(int a, int b);
    }

    public static int divide(int a, int b, DivisionOperation operation) {
        return operation.divide(a, b);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        System.out.println("Result of division: " + divide(num1, num2, (a, b) -> a / b));
    }
}
