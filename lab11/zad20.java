import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class zad20 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "cherry");
        List<String> result = words.stream()
                .distinct().sorted().collect(Collectors.toList());
        System.out.println("Oryginalna lista: " + words);
        System.out.println("Wynikowa lista: " + result);
    }
}
