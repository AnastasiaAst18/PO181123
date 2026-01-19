import java.util.Deque;
import java.util.Arrays;
import java.util.ArrayDeque;

public class zad8Test {
    public static void main(String[] args) {
        Deque<Integer> nums = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println("Liczby [1, 2, 3, 2, 1] symetryczne? " + zad8.isSymmetric(nums));
        Deque<Integer> nonSymNums = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Liczby [1, 2, 3, 4, 5] symetryczne? " + zad8.isSymmetric(nonSymNums));
        Deque<String> words = new ArrayDeque<>(Arrays.asList("Kajak", "Woda", "Kajak"));
        System.out.println("Stringi[Kajak, Woda, Kajak] symetryczne? " + zad8.isSymmetric(words));
        System.out.println("Pusta kolejka symetryczna? " + zad8.isSymmetric(new ArrayDeque<>()));
        System.out.println("Jeden element [X] symetryczny? " + zad8.isSymmetric(new ArrayDeque<>(Arrays.asList("X"))));
        Deque<Integer> evenSym = new ArrayDeque<>(Arrays.asList(1, 2, 2, 1));
        System.out.println("Liczby [1, 2, 2, 1] symetryczne? " + zad8.isSymmetric(evenSym));
    }
}
