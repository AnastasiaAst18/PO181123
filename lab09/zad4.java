public class zad4 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayOperations.swap(numbers, 0, 2);
        String[] colors = {"Czerwony", "Zielony", "Niebieski"};
        ArrayOperations.swap(colors, 1, 2);
        try {
            ArrayOperations.swap(numbers, 0, 10);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
