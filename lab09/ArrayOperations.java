public class ArrayOperations {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null)
        {
            throw new IllegalArgumentException("Tablica nie może być nullem.");
        }
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length)
        {
            throw new IndexOutOfBoundsException(String.format("Indeksy (%d, %d) muszą mieścić się w zakresie 0 - %d",
                    index1, index2, array.length - 1));
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
