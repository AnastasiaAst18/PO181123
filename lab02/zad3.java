import java.util.Random;

public class zad3 {
    public static int generateRandomIntInRange(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min nie może być większe od max.");
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {
        int min = 5;
        int max = 10;
        for (int i = 0; i < 5; i++)
        {
            int wynik = generateRandomIntInRange(min, max);
            System.out.println("Losowa liczba z zakresu: " + wynik);
        }
    }
}
