import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class zad7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kot", "telewizor", "mysz", "programowanie", "java");
        words.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        System.out.println("Posortowane malejąco według długości: ");
        System.out.println(words);
    }
}
