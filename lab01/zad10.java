import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();
        System.out.print("Podaj liczbę m (musi być większa od n): ");
        int m = scanner.nextInt();
        if (n >= m)
        {
            System.out.println("Błąd. n musi byćmniejsze od m.");
        }
        else
        {
            int suma = 0;
            int i = n;
            while (i <= m)
            {
                suma += i;
                i++;
            }
            System.out.println("Wynik: " + suma);
        }
        scanner.close();
    }
}
