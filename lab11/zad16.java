import java.util.List;
import java.util.Arrays;
public class zad16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 2, -1, 8, 0, -3, 4);
        numbers.stream()
                .filter(n -> n >= 0)
                .map(n ->n * n)
                .forEach(System.out::println);
    }
}
