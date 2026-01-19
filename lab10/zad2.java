import java.util.TreeSet;
import java.util.List;
import java.util.Arrays;

public class zad2 {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Lista oryginalna: " + numbers);
        SequenceUtils.reversePrint(numbers);
        System.out.println("---");
        TreeSet<String> colors = new TreeSet<>(Arrays.asList("Czerwony", "Zielony", "Niebieski"));
        System.out.println("Zbiór (posortowany): " + colors);
        SequenceUtils.reversePrint(colors);
    }
}
