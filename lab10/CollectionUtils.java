import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CollectionUtils {
    public static void printUnique(Collection<?> items) {
        if (items == null || items.isEmpty()) {
            System.out.println("Kolekcja jest pusta lub wynosi null.");
            return;
        }
        Set<Object> uniqueElements = new HashSet<>(items);
        System.out.println("Unikalne elementy: ");
        for (Object element : uniqueElements) {
            System.out.println("- " + element);
        }
    }
}
