import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] liczby = new int[20];
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt(100) + 1;
            suma += liczby[i];
        }
        System.out.println("Wylosowane liczby: ");
        for (int liczba : liczby)
        {
            System.out.print(liczba + " ");
        }
        double srednia = (double) suma / liczby.length;
        System.out.println("Srednia: " + srednia);
    }
}
