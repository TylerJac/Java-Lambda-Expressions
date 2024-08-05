import java.util.Arrays;

public class Count {
    @FunctionalInterface
    public interface Counter {
        int count(int[] array);
    }

    public static int countPositiveNumbers(int[] array, Counter counter) {
        return counter.count(array);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Count of numbers using a lambda expression: "
                + countPositiveNumbers(numbers, array -> (int) Arrays.stream(array)
                .filter(num -> num > 0)
                .count()));
    }
}
