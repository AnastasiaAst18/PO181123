import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class zad10 {
    public static <K, V> Map<V, K> reverseMap(Map<K, V> map)
    {
        if (map == null)
        {
            return null;
        }
        Map<V, K> reversed = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet())
        {
            reversed.put(entry.getValue(), entry.getKey());
        }
        return reversed;
    }
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1, "Ania");
        students.put(2, "Julia");
        students.put(3, "Anton");
        Map<String, Integer> reversed = reverseMap(students);
        System.out.println("Oryginał: " + students);
        System.out.println("Po odwróceniu: " + reversed);
    }
}
