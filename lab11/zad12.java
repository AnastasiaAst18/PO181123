import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class MathUtils
{
    static int square(int x)
    {
        return x * x;
    }
}
public class zad12
{
    public  static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareNumbers = numbers.stream()
                .map(MathUtils::square)
                .collect(Collectors.toList());
        System.out.println("Oryginalne liczby: " + numbers);
        System.out.println("Kwadraty liczb: " + squareNumbers);
    }
}