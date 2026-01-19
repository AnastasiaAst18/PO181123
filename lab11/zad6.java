import java.util.Arrays;
import java.util.List;
public class zad6
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Liczby parzyste: ");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n));
    }
}
