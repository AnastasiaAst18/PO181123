import java.util.ArrayList;
import java.util.Arrays;

public class zad3 {
    public static void main(String[] args) {
        ArrayList<String> fruits1 = new ArrayList<>(Arrays.asList("Jabłko", "Banan"));
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("Cytryna", "Pomarańcza"));
        ArrayList<String> allFruits = ListUtils.mergeLists(fruits1, fruits2);
        System.out.println("Połączona lista: " + allFruits);
    }
}
