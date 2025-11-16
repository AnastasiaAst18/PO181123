import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        if (liczba < 0)
        {
            System.out.println("Podano liczbę ujemną. Program obsługuje tylko liczby dodatnie.");
        }
        else
        {
            int odwrocona = 0;
            int temp = liczba;
            while (temp > 0)
            {
                int cyfra = temp % 10;
                odwrocona = odwrocona * 10 + cyfra;
                temp /= 10;
            }
            System.out.println("Liczba odwrócona: " + odwrocona);
        }
        scanner.close();
    }
}
