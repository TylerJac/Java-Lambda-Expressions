import java.util.function.Supplier;
public class NumberGen {
    private final Supplier<Integer> generator;

    public NumberGen(Supplier<Integer> generator) {
        this.generator = generator;
    }
    public int generateNumber() {
        return generator.get();
    }
    public static void main(String[] args) {
        NumberGen gen = new NumberGen(() -> (int) (Math.random() * 100));
        System.out.println(gen.generateNumber());
    }
}
