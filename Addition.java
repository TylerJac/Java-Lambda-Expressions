public class Addition {
    @FunctionalInterface
    public interface Addable {
        int add(int a, int b);
    }

    public static void main(String[] args) {
        Addable addable = (a, b) -> a + b;
        System.out.println(addable.add(5, 3));
    }
}
