import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class zad17 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kot", "dom", "telewizor", "mysz", "programowanie");
        Optional<String> firstLongWord = words.stream()
                .filter(s -> s.length() > 5)
                .findFirst();
        firstLongWord.ifPresent(word -> System.out.println("Znaleziono: " + word));
        String result = firstLongWord.orElse("Nie znaleziono odpowiedniego napisu");
        System.out.println("Wynik: " + result);
    }
}
