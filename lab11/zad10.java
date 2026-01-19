import java.util.function.IntConsumer;
public class zad10 {
    public static void process(IntConsumer action)
    {
        int exampleNumber = 5;
        action.accept(exampleNumber);
    }
    public static void main(String[] args) {
        process(n -> System.out.println(n * n));
    }
}
