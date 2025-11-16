import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Podaj liczby (ujemna liczba będzie końcem): ");
        do {
            liczba = scanner.nextInt();
            if (liczba >= 0)
            {
                if (liczba < min)
                {
                    min = liczba;
                }
                if (liczba > max)
                {
                    max = liczba;
                }
            }
        } while (liczba >= 0);
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE)
        {
            System.out.println("Nie wprowadzono żadnej liczby nieujemnej.");
        }
        else {
            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Największa liczba: " + max);
        }
        scanner.close();
    }
}
