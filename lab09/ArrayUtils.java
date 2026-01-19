public class ArrayUtils {
    public static <T extends Comparable<T>> T max(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta ani równa null.");
        }
        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
