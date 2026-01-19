import java.util.Arrays;
import java.util.LinkedList;

public class zad4 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
        LinkedList<String> words = new LinkedList<>(Arrays.asList("Kajak", "nie", "Kajak"));
        System.out.println("Czy liczby są palindromem? " + ListU.isPalindrome(nums));
        System.out.println("Czy słowa są palindromem? " +  ListU.isPalindrome(words));
    }
}
