import java.util.HashMap;
import java.util.Map;
public class zad11 {
    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map)
    {
        if (map == null)
        {
            return new HashMap<>();
        }
        HashMap<V, Integer> occurrences = new HashMap<>();
        for (V value : map.values())
        {
            occurrences.merge(value, 1, Integer :: sum);
        }
        return occurrences;
    }
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Apple");
        fruits.put(4, "Strawberry");
        fruits.put(5, "Mango");
        HashMap<String, Integer> counts = countValueOccurrences(fruits);
        System.out.println("Oryginalna mapa: " + fruits);
        System.out.println("Liczba wystąpień: " + counts);
    }
}
