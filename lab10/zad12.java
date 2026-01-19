import com.sun.source.tree.Tree;

import java.util.TreeMap;
public class zad12 {
    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        if (map == null) return null;
        return new TreeMap<>(map.subMap(startKey, true, endKey, true));
    }
    public static void main(String[] args) {
        TreeMap<Integer,String> directory = new TreeMap<>();
        directory.put(101, "Kowalski");
        directory.put(105, "Nowak");
        directory.put(110, "Korisnik");
        directory.put(120, "Wójcik");
        TreeMap<Integer, String> result = subMapInRange(directory, 103, 115);
        System.out.println("Oryginalna mapa: " + directory);
        System.out.println("Wynikowy zakres [105, 115]: " + result);
    }
}
