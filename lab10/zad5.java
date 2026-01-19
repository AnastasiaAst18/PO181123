import java.util.List;
import java.util.HashSet;

public class zad5 {
    public static <T> HashSet<T> findUniqueElements(List<T> list)
    {
        if (list == null
        ) {

            return new HashSet<>();
        }
        return new HashSet<>(list);
    }
    public static void main(String[] args) {
        List<String> names = List.of("Ania", "Tomek", "Ania", "Kasia", "Tomek");
        HashSet<String> uniqueNames = findUniqueElements(names);
        System.out.println("Oryginalna lista: " + names);
        System.out.println("Unikalne elementy: "+ uniqueNames);
    }
}
