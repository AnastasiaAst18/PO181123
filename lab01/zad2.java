import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();
        System.out.print("Wybierz opierację (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);
        double wynik;
        switch (operacja)
        {
            case '+':
                wynik = liczba1 + liczba2;
                System.out.println("Wynik: " + wynik);
                break;
            case '-':
                wynik = liczba1 - liczba2;
                System.out.println("Wynik: " + wynik);
                break;
            case '*':
                wynik = liczba1 * liczba2;
                System.out.println("Wynik: " + wynik);
                break;
            case '/':
                if (liczba2 != 0)
                {
                    wynik = liczba1 / liczba2;
                    System.out.println("Wynik: " + wynik);
                }
                else
                {
                    System.out.println("Błąd.");
                }
                break;
            default:
                System.out.println("Niepoprawna operacja.");
                break;
        }
        scanner.close();
    }
}
