import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = scanner.nextInt();
        System.out.print("Podaj liczbę c: ");
        int c = scanner.nextInt();
        if (a <= 0 || b <= 0 || c <= 0)
        {
            System.out.println("Wszystkie liczby muszą być dodatnie.");
        }
        else
        {
            boolean znalieziono = false;
            for (int i = b + 1; i <= a; i++)
            {
                if (i % c == 0)
                {
                    System.out.print(i + " ");
                    znalieziono = true;
                }
            }
            if (!znalieziono)
            {
                System.out.println("Brak liczb spełniających warunki.");
            }
        }
        scanner.close();
    }
}

