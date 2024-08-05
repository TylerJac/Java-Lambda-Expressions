public class sayHello {
    public static void main(String[] args) {
        Greeting greeting = (String name) -> {
            System.out.println("Hello, " + name);
        };

        greeting.sayHello("John");
    }

    @FunctionalInterface
    public interface Greeting {
        void sayHello(String name);
    }
}