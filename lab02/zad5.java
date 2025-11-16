import java.util.Arrays;
import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] liczby = new int[30];
        for (int i = 0; i < liczby.length; i++)
        {
            liczby[i] = random.nextInt(100) + 1;
        }
        System.out.println("Wylosowane liczby: ");
        for (int liczba : liczby)
        {
            System.out.print(liczba + " ");
        }
        int licznikKwadratow = 0;
        for (int liczba : liczby)
        {
            for (int i = 0; i * i <= liczba; i++)
            {
                if (i * i == liczba)
                {
                    licznikKwadratow++;
                    break;
                }
            }
        }
        System.out.println("\nWynik: " + licznikKwadratow);
    }
}
