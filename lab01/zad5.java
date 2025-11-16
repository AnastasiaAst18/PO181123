import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swój dochód: ");
        double dochod = scanner.nextDouble();
        double podatek;
        if (dochod <= 85528)
        {
            podatek = dochod * 0.18;
        }
        else
        {
            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }
        if (podatek < 0)
        {
            podatek = 0;
        }
        System.out.printf("Podatek do zapłaty wynosi: %.2f PLN%n", podatek);
        scanner.close();
    }
}
