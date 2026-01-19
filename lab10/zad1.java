import java.util.Arrays;
import java.util.List;
public class zad1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Piotr", "Anna", "Marek", "Piotr");
        System.out.println("Oryginalna lista: " + names);
        CollectionUtils.printUnique(names);
    }
}
