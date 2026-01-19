import java.util.Arrays;
import java.util.List;
public class zad19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 12, -3, 44);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        if (allPositive) {
            System.out.println("Wszystkie liczby są dodatnie.");
        }
        else
        {
            System.out.println("Na liście znajduje się co najmniej jedna liczba mniejsza lub równa zero.");
        }
    }
}
