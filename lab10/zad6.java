import java.util.TreeSet;

public class zad6 {
    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound)
    {
        return new TreeSet<>(set.subSet(lowerBound, true, upperBound, true));
    }
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 1; i <= 10; i++)
        {
            numbers.add(i);
            TreeSet<Integer> result = findElementsInRange(numbers, 3, 7);
            System.out.println("Oryginalny zbiór: " + numbers);
            System.out.println("Elementy w zakresie [3, 7]: " + result);
        }
    }
}
