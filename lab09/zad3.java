public class zad3 {
    public static void main(String[] args) {
        Integer[] numbers = {3, 7, 1, 9, 2};
        System.out.println("Największa liczba: " + ArrayUtils.max(numbers));
        String[] fruits = {"Jabłko", "Pomarańcza", "Banan"};
        System.out.println("Ostatni alfabetycznie: " + ArrayUtils.max(fruits));
        try {
            ArrayUtils.max(new String[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
